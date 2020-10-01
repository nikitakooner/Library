package main;

public class Books extends Library implements Reservable {
	private String Genre;
	private String Title; 

	public Books() {
		super();
		System.out.println("There is no books");
	}
	
	public Books(String Genre, String Title) {
		super();
		this.Genre = Genre;
		this.Title = Title;
	}	
	
	public Books(String Genre, String Title, String Name, int serialNo) {
		super(Name, serialNo);
		this.Genre = Genre;
		this.Title = Title;
	}	
	
	public static void speak() {
        System.out.println("I Am a Book");
    }

	//Getters and Setters
	public String getGenre() {
		return Genre;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}
	 @Override
	    public void reserve(){
	        System.out.println("this book can be reserved");
	    }
}

