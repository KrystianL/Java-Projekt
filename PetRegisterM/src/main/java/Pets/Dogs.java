package Pets;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import Humans.Human;

@Entity
public abstract class Dogs implements DogInterface{

	@Id
	@GeneratedValue
	protected int id;
	@ManyToOne
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Human getOwner() {
		return owner;
	}
	
	
}
