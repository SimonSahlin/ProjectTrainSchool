package com.projecttrainschool;

import java.util.ArrayList;
import java.util.Scanner; 

public class Menu {
	
	int menu;
	int answer;
	
	ArrayList <Ticket> passangerList = new ArrayList <Ticket>();
	
	public void Menu () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("V�lj ett av f�ljande alternativ:\n1. F�r att registrera ny passagerare.\n2. F�r att visa en lista med passagerare ombord.");
		answer = scanner.nextInt();
		switch (answer) {
		case 1: 
			Passanger passanger = Passanger.createPassenger();
			Ticket ticket = new Ticket(this, passanger);
			passangerList.add(ticket);
			ticket.ShowPrice();
			break; 
		case 2: 
			System.out.println("H�r �r en lista med alla passangerare:\n");
			System.out.println("Listansstorlek = " + passangerList.size());
			for (int i = 0; i < passangerList.size(); i++) {
				Ticket passangerTicket = passangerList.get(i);
				System.out.println(passangerTicket.passanger.getFullName() + ", " + passangerTicket.passanger.getAge());
			}
			
			System.out.println("\nVill du avsluta eller registerar ny passagerare?\n1. F�r att registrera ny passagerare.\n2. F�r att avsluta.");
			answer = scanner.nextInt();
			switch (answer) {
			case 1: 
				passanger = Passanger.createPassenger();
				ticket = new Ticket(this, passanger);
				ticket.ShowPrice();
				break; 
			case 2: 
				System.out.println("Bra jobbat!");
			}
		}	
	}
}