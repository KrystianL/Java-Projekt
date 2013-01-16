package Main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Pets.Dogs;
import Pets.HumanDog;
import Humans.*;
import Management.HibernateHumanManager;
import Management.HumanManager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
	
		
		
		HumanManager hm = new HumanManager (session);
		hm.save(new Human ("Kasia","1234" ));
		Human human =new Human("Kasia");
		human.setId(10);
		hm.delete(human);
		for (Human p: hm.getAll())
		{
			System.out.println(p.getName());
		}
		
		
		session.close();
		//System.out.println("Osoba o id 4:"+mgr.get(4).getName());
		
	}



}
