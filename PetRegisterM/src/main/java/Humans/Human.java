package Humans;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import Pets.*;

@NamedQueries({
		@NamedQuery(
					name="allHumansById",
					query="from Human p where p.id= :id " ),
		@NamedQuery(
				name="allHumans",
				query="from Human p"
				),
		@NamedQuery(
				name="deleteFromHuman",
				query="delete Human where id=:id"
				)})
		
@Entity
@Table(name="OSOBY")
public class Human {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="imie")
	private String name;
	
	@OneToMany(mappedBy="owner", cascade=javax.persistence.CascadeType.PERSIST)
	private Collection<Dogs> pets;
	private String pesel;
	
	public Human(String name, String pesel)
	{
		this.pesel=pesel;
		this.name=name;
		this.pets=new PetsList(this);
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
	public Collection<Dogs> getPets() {
		return pets;
	}
	public void setPets(List<Dogs> pets) {
		this.pets = pets;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
