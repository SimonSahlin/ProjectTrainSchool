package com.projecttrainschool;

import java.util.ArrayList;
import java.util.Scanner;

public class Travelers {

	Passanger passanger = new Passanger("");
	
	public void AskTraveler() {
		int age; 
		Scanner scanner = new Scanner(System.in);
		ArrayList <Passanger> passangerList = new ArrayList<Passanger>();
		System.out.println("Hej och välkommen ombord.\nVad är ditt förnamn?");
		passanger.setFirstName(scanner.nextLine());
		System.out.println("Tack, och ditt efternamn?");
		passanger.setLastName(scanner.nextLine());
		System.out.println("Välkommen " + passanger.getFullName() + ".\nFör att veta kostnaden för biljetten måste jag veta din ålder, hur gammal är du?");
		passanger.setAge(age = scanner.nextInt());
		passangerList.add(new Passanger(passanger.getFullName()));
		scanner.close();
	}
}
