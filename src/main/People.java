package main;

import java.util.ArrayList;
import java.util.List;

public class People extends Library {
	private String firstName;
	private String lastName;
	
	public People() {
		super();
		
	}
	public People(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private ArrayList<People> People = new ArrayList<>();
	

	public boolean addPeople(People People) {
		return this.People.add(People);
	}
	
	public boolean removePeople(People People) {
		return this.People.add(People);
	}

	public void removeByName(String type) {
		List<People> toRemove = new ArrayList<>();
		for (People People : this.People) {
			if (People.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(People);
			}
		}
	}
	public void updateItems(People People ) {
		// TODO Auto-generated method stub
		
	}

	

}
