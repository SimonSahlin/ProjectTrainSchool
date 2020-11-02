package com.projecttrainschool;

import java.util.Scanner;

public class Passanger {
	
	private int age;
	private String firstName; 
	private String lastName;
	private String fullName; 
	

	public Passanger(String firstName, String lastName, int age) {
		this.firstName = firstName; 
		this.lastName = lastName; 
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

	public static Passanger createPassenger() {
		Passanger passanger = new Passanger("", "", 0);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hej och v�lkommen ombord.\nVad �r ditt f�rnamn?");
		passanger.setFirstName(scanner.nextLine());
		System.out.println("Tack, och ditt efternamn?");
		passanger.setLastName(scanner.nextLine());
		passanger.setFullName(passanger.getFirstName() + " " + passanger.getLastName()); 
		System.out.println("V�lkommen " + passanger.getFullName() + ".\nF�r att veta kostnaden f�r biljetten m�ste jag veta din �lder, hur gammal �r du?");
		passanger.setAge(scanner.nextInt());
		
		return passanger; 
	}		

}


