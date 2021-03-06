package Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import Humans.Human;

public class HumanManager implements ManagerInterface<Human>{

	Connection conn;
	private String url = "jdbc:hsqldb:hsql://localhost/workdb";

	String createTable=
			"CREATE TABLE Human(id bigint GENERATED BY DEFAULT AS IDENTITY," +
			" name varchar(20), pesel varchar(20))";
 
	Statement statement;
	PreparedStatement addHumanStatement;
	PreparedStatement deleteHumanStatement;
	PreparedStatement getAllHumansStatement;
	PreparedStatement getHumanByIdStatement;
	public HumanManager(Session session)
	{
		try {
			conn=DriverManager.getConnection(url);
			statement = conn.createStatement();

			ResultSet rs = conn.getMetaData().getTables(null, null, null,
					null);
			boolean tableExists = false;
			while (rs.next()) {
				if ("Human".equalsIgnoreCase(rs.getString("TABLE_NAME"))) {
					tableExists = true;
					break;
				}
			}

			if(!tableExists)
			{
				statement.executeUpdate(createTable);

			}

			addHumanStatement = conn
					.prepareStatement(
							"INSERT INTO Human (name, pesel) " +
							"VALUES (?, ?)");
			deleteHumanStatement=conn
					.prepareStatement("DELETE From Human WHERE name=?");
			getAllHumansStatement = conn
					.prepareStatement("SELECT * FROM Human");
			getHumanByIdStatement=conn
					.prepareStatement("SELECT * FROM Human WHERE id=?");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}


	@Override
	public Human get(int id) {
		try {
			getHumanByIdStatement.setInt(1, id);
			ResultSet rs= getHumanByIdStatement.executeQuery();
			while(rs.next())
			{
				return new Human(rs.getString("Name"),rs.getString("pesel"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	
	public List<Human> getAll() {
		List<Human> result= new ArrayList<Human>();

		try {
			ResultSet rs= getAllHumansStatement.executeQuery();
			while(rs.next())
			{
				Human p = new Human();
				p.setName(rs.getString("name"));
				p.setPesel(rs.getString("pesel"));
				result.add(p);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean save(Human obj) {
		try {
			addHumanStatement.setString(1, obj.getName());
			addHumanStatement.setString(2, obj.getPesel());
			return addHumanStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Human obj) {

		try {
			deleteHumanStatement.setString(1, obj.getName());
			deleteHumanStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}