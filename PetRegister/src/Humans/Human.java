package Humans;

import java.util.ArrayList;
import java.util.List;

import Pets.*;

public class Human {
	
	private String name;
	
	private List<Dogs> Pets;
	
	private String pesel;
	public Human(String name, String pesel)
	{
		this.name=name;
		this.Pets=new ArrayList<Dogs>();
		this.pesel=pesel;
	}
	public Human(String name) {

		this(name,"");
	}
	public Human()
	{
		this("","");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Dogs> getPets() {
		return Pets;
	}
	public void setCars(List<Dogs> Pets) {
		this.Pets = Pets;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}



}
