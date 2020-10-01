package main;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner input = new Scanner(System.in);
			int choice = 0;
			System.out.println("********************Welcome to the Public Library!********************");
			System.out.println("              Please Select From The Following Options:               ");
			System.out.println("**********************************************************************");
//			//- Check out item
//			- Check in item
//			- Update item
//			- Register person
//			- Delete person
//			- Update person
			Library book1 = new Books("romance", "Me Before You");
			
			Library book2 = new Books("horror", "Scare");
			Library mag1 = new Magazines("Hello");

			Library Library = new Library();
			Library.addLibrary(book1);
			Library.addLibrary(book2);
			Library.addLibrary(mag1);

			System.out.println(book1.getClass().getName());
			System.out.println(Library);
			System.out.println("Book");
			Books.speak();
			System.out.println(Library);
			Library.removeItem(mag1);
			System.out.println(Library);

		}
	
		People person1 = new People("Nikita", "Kooner");
		People person2 = new People("Holly", "Heer");
		People person3 = new People("John", "Smith");
		People person4 = new People("Bob", "Jones");
		People People = new People();
		People.addPeople(person1);
		People.addPeople(person2);
		People.addPeople(person3);
		People.addPeople(person4);
		System.out.println(person1.getClass().getName());
		System.out.println(People);
		System.out.println("Nikita");
		People.updateItems(person4 = new People("hello", "world"));
		System.out.println(person4);
		System.out.println(People);
		

	}
}