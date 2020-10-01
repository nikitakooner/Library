package main;

import java.util.ArrayList;
import java.util.List;

public class Library {
	protected String Name;
	protected int serialNo;

	public Library() {

	}

	public Library(String Name, int SerialNo) {

	}

	public Library(String Name) {

	}

	// Getters/Setters
	public int getSerialNo() {
		return serialNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

// methods 

	public boolean addLibrary(Library Library) {
		return this.Library.add(Library);
	}

	private ArrayList<Library> Library = new ArrayList<>();

	public boolean removeItem(Library Library) {
		return this.Library.add(Library);
	}

	public void removeByName(String type) {
		List<Library> toRemove = new ArrayList<>();
		for (Library Library : this.Library) {
			if (Library.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(Library);
			}
		}
	}


}
