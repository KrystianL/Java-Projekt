package Pets;
import javax.persistence.Entity;

@Entity
public class HumanDog extends Dogs {
	
	private String race;
	private String name;

	public HumanDog(String race, String name)
	{
		this.race=race;
		this.name=name;
	}
	public HumanDog()
	{
		this("","");
	}
	
	public String getRace(){
		return race;
	}
	public void setRace(String race){
		this.race=race;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	@Override
	public String getDogsDetails() {
		// TODO Auto-generated method stub
		return race+" "+name;
	}

	@Override
	public Dogs Clone() {

		HumanDog returnValue =new HumanDog();
		returnValue.setName(this.name);

		return returnValue;
	}
}
