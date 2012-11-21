package Main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Pets.Dogs;
import Pets.HumanDog;
import Humans.*;
import Management.HibernateHumanManager;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
	
		
		HibernateHumanManager mgr = new HibernateHumanManager(session);
		mgr.save(new Human("Adam","1234"));
		mgr.save(new Human("Michal","1234"));
		mgr.save(new Human("Paweł","1234"));
		Human human =new Human("Adam");
		human.setId(10);
		mgr.delete(human);
		//session.getTransaction().commit();
		for(Human p: mgr.getAll())
		{
			System.out.println(p.getName());
		}
		
		session.close();
		//System.out.println("Osoba o id 4:"+mgr.get(4).getName());
		
	}

}
