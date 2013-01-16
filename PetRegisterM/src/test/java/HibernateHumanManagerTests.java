import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Humans.Human;
import Management.HibernateHumanManager;

public class HibernateHumanManagerTests {
	
	private HibernateHumanManager mgr;
	private SessionFactory factory;
	
	@BeforeClass 
	public static void setUpBeforeClass() throws Exception{
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
	}

	@Before
	public void setUp() throws Exception {
		factory = new Configuration().configure().buildSessionFactory();
		mgr = new HibernateHumanManager(factory.openSession());
		
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGet(){
		Human result = mgr.get(1);
		Human result2 = mgr.get(1);
		Human result3 = mgr.get(100);
		assertNotNull("brak wyników",result);
		assertEquals("źle ustawione ID",result.getId(),1);
		
		assertEquals("złe ustawienie imion",result.getName(),"Adam");
		assertEquals("złe ustawienie peselu",result.getPesel(),"12345");
		assertNotSame("obiekty nie powinny wskazywać na to samo pole w pamięci",result,result2);
		assertNull("nie zwraca null gdy nie ma wyniku w bazie",result3);
		
	}
	
	@Test
	public void testGetAll()
	{
		List<Human> results = mgr.getAll();
		
		assertNotNull("Lista jest nullem",results);
		assertTrue("ilość elementów w liście się nie zgadza",results.size()==5);
		
	}
	

	@Test
	public void testDelete(){
		Human p = mgr.get(1);
		boolean deleted = mgr.delete(p);
				Human result = mgr.get(1);
				assertTrue("nie skasowano",deleted);
				assertTrue("ilosc danych w bazie nie zmalala", mgr.getAll().size()==4);
	
	}
}
