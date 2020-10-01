package main;

public class Magazines extends Library implements Reservable {
	private int copyNo;
	
	public Magazines() {
		super();
		System.out.println("There is no Magazines");
	}
	public Magazines(int copyNo) {
		super();
		this.copyNo = copyNo;
	}	
	
	public Magazines(int copyNo, String Name, int serialNo) {
		super(Name, serialNo);
		this.copyNo = copyNo;
	}	
	public Magazines(String Name) {
		super(Name);
		
	}	
//Getters and Setters
	public int getCopyNo() {
		return copyNo;
	}

	public void setCopyNo(int copyNo) {
		this.copyNo = copyNo;
	}
	
	 @Override
	    public void reserve(){
	        System.out.println("Magazines can't be reserved");
	    }

}
