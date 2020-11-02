package com.projecttrainschool;

import java.util.ArrayList;
import java.util.Scanner;

public class Passanger {
	
	private int age;
	private String firstName; 
	private String lastName;
	private String fullName; 
	
	ArrayList <Passanger> passangerList = new ArrayList<Passanger>();
	
	public Passanger(String fullName, int age) {
		this.fullName = fullName; 
		this.age = age; 
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	} 

	public void AskPassanger() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hej och välkommen ombord.\nVad är ditt förnamn?");
		setFirstName(scanner.nextLine());
		System.out.println("Tack, och ditt efternamn?");
		setLastName(scanner.nextLine());
		System.out.println("Välkommen " + getFullName() + ".\nFör att veta kostnaden för biljetten måste jag veta din ålder, hur gammal är du?");
		setAge(scanner.nextInt());
		passangerList.add(new Passanger(getFullName(), getAge()));
		System.out.println(getAge());
		scanner.close();
	}
	public void testPassanger() {
		System.out.println(getFirstName());
	}
	
}
