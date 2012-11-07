package Pets;

import Humans.Human;

public abstract class Dogs implements DogInterface {

	protected Human owner;
	
	public void printData()
	{
		System.out.println("Owner: "+owner.getName());
		System.out.println(getDogsDetails());
	}
	
	public abstract String getDogsDetails();

	public abstract Dogs Clone();

	public void setOwner(Human owner)
	{
		this.owner=owner;
	}
}
