package Pets;

import Humans.Human;

public abstract class Dogs implements DogInterface {

	protected Human owner;
	
	public void setOwner(Human owner)
	{
		this.owner=owner;
	}
}
