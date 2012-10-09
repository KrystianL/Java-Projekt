package Humans;

import java.util.ArrayList;
import java.util.List;

import Pets.*;

public class Human {
	
	private String name;
	
	private List<Dogs> Pets;
	
	public Human(String name)
	{
		this.name=name;
		this.Pets=new PetsList(this);
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public List<Dogs> getPets(){
		return Pets;
	}
	public void setPets(List<Dogs> Pets){
		this.Pets=Pets;
	}

}
