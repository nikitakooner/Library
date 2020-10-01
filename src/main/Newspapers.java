package main;

	public class Newspapers extends Library{
	
		private int Age;
	
	public Newspapers(){
		super();
		System.out.println("There is no Newspapers");
	}
	
	public Newspapers(int Age) {
		super();
		this.Age = Age;
	}	
	
	public Newspapers(int Ages, String Name, int serialNo) {
		super(Name, serialNo);
		this.Age = Age;
	}	
	public Newspapers(String Name) {
		super(Name);
		
	}	

//Getters and Setters
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
}
