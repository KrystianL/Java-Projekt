import static org.junit.Assert.*;

import org.junit.Test;

import Humans.Human;
import Management.GetByNameCondition;


public class TestGetByNameCondition {

	@Test
	public void testcheck() {
		
		GetByNameCondition c = new GetByNameCondition("Asia");
		
		
		Human h1 = new Human();
		Human h2 = new Human();
		h1.setName ("Asia");
		h2.setName ("Kasia");
		
		assertTrue (c.check(h1));
		assertFalse (c.check(h2));
	}

}
