import static org.junit.Assert.*;

import org.junit.Test;

import Pets.HumanDog;


public class TestPetRegister {

	@Test
	public void testGetDogsDetails() {
		
		//assertNotNull, assertTrue, assertEquals,assertSame, 
		HumanDog dog= new HumanDog();
		dog.setName("pimpek");
		dog.setRace("kundel");
		String result = dog.getDogsDetails();
		
		assertNotNull(result);
		assertEquals(result, "kundel pimpek");
		assertTrue(result.equals("kundel pimpek"));
		
	}

	@Test
	public void testGetRace() {
			
		HumanDog dog= new HumanDog();
		dog.setRace("kundel");
		String result = dog.getRace();
		assertNotNull(result);
		assertEquals(result, "kundel");
		assertTrue(result.equals("kundel"));
		
	}
	
	

	@Test
	public void testSetRace() {
		
		HumanDog dog= new HumanDog();
		dog.setRace("kundel");
		String result = dog.getRace();
		assertNotNull(result);
		assertEquals(result, "kundel");
		assertTrue(result.equals("kundel"));
	}

	@Test
	public void testGetName() {
		
		HumanDog dog= new HumanDog();
		dog.setName("pimpek");
		String result = dog.getName();
		assertNotNull(result);
		assertEquals(result, "pimpek");
		assertTrue(result.equals("pimpek"));
	}

	@Test
	public void testSetName() {
		
		HumanDog dog= new HumanDog();
		dog.setName("pimpek");
		String result = dog.getName();
		assertNotNull(result);
		assertEquals(result, "pimpek");
		assertTrue(result.equals("pimpek"));
	}
	

}
