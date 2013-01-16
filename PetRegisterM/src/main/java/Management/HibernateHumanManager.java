package Management;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Humans.Human;

public class HibernateHumanManager implements ManagerInterface<Human>{
	private Session session;
	
	public HibernateHumanManager(Session session)
	{
		this.session = session;
	}
	
	@Override
	public Human get(int id){
		List<Human> result = session.getNamedQuery("allHumansById")
				.setInteger("id", id).list();
		if(result.size()==0)
		
		return null;
		Human returnValue = new Human(
				result.get(0).getName(),
				result.get(0).getPesel());
		returnValue.setId(result.get(0).getId());
		return returnValue;
				
	}
	@Override
	public List<Human> getAll(){
		return (List<Human>)this.session.getNamedQuery("allHumans").list();
		
	}
	@Override
	public boolean save(Human obj) {
		try{
			session.beginTransaction();
			session.save(obj);
			
			session.getTransaction().commit();
			return true;
		}catch(Exception ex)
		{}
		return false;
		
	}
	@Override
	public boolean delete(Human obj){
		try{
			this.session.beginTransaction();
			this.session.getNamedQuery("deleteFromHuman")
			.setInteger("id",obj.getId())
			.executeUpdate();
			this.session.getTransaction().commit();
			return true;
		}
	catch(Exception ex)
	{
		return false;
	}
	}
}