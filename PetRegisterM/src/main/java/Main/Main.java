package Main;

import Pets.Dogs;
import Pets.HumanDog;
import Humans.Human;

public class Main {


	public static void main(String[] args) {

		Human p = new Human("Adam");

		Dogs d1=new HumanDog("Labrador", "Ciof");
		

		
		p.getPets().add(d1);

		for(Dogs d : p.getPets())
		{
			d.printData();
		}

	}

}