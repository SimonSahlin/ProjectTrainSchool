package com.projecttrainschool;

import java.util.Scanner; 

public class Menu {
	Passanger passanger = new Passanger("", 0);
	Travelers travelers = new Travelers();
	int menu;
	int answer;
	
	public void Menu () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("V�lj ett av f�ljande alternativ:\n1. F�r att registrera ny passagerare.\n2. F�r att visa en lista med passagerare ombord.");
		answer = scanner.nextInt();
		switch (answer) {
		case 1: 
			passanger.AskPassanger();
			break; 
		}
	}	
}
