package com.projecttrainschool;

import java.util.ArrayList;
import java.util.Scanner;

public class Travelers {

	Passanger passanger = new Passanger("");
	
	public void AskTraveler() {
		int age; 
		Scanner scanner = new Scanner(System.in);
		ArrayList <Passanger> passangerList = new ArrayList<Passanger>();
		System.out.println("Hej och v�lkommen ombord.\nVad �r ditt f�rnamn?");
		passanger.setFirstName(scanner.nextLine());
		System.out.println("Tack, och ditt efternamn?");
		passanger.setLastName(scanner.nextLine());
		System.out.println("V�lkommen " + passanger.getFullName() + ".\nF�r att veta kostnaden f�r biljetten m�ste jag veta din �lder, hur gammal �r du?");
		passanger.setAge(age = scanner.nextInt());
		passangerList.add(new Passanger(passanger.getFullName()));
		scanner.close();
	}
}
