package Management;

import java.util.ArrayList;
import java.util.List;

import Pets.Dogs;
import Humans.Human;

public class DatabaseContext {

	private static List<Human> humans=new ArrayList<Human>();
	private static List<Dogs> pets=new ArrayList<Dogs>();

	public static List<Human> gethumans() {
		return humans;
	}
	public static List<Dogs> getPets() {
		return pets;
	}


}