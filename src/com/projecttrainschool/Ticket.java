package com.projecttrainschool;

import java.util.Scanner;

public class Ticket {
	Menu menu = new Menu();
	Passanger passanger = new Passanger("", 0);
	int dicountSinglePrice = 20;
	int discountMonthPrice = 450; 
	int normalSinglePrice = 35; 
	int normalMonthPrice = 600; 
	int monthOrSingle; 
	
	public void ShowPrice() {
		if (passanger.getAge() < 18 || passanger.getAge() > 65) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Tack, du kvalificeras f�r ett rabatterat pris, vill du ha ett m�nadskort f�r " + discountMonthPrice + " kr. Eller ett eng�ngskort f�r " + dicountSinglePrice + "kr?\nTryck 1 f�r m�nadskort.\nTryck 2 f�r eng�ngskort.");
			monthOrSingle = scanner.nextInt();
			if (monthOrSingle == 1) {
				System.out.println("OK, d� blir det " + discountMonthPrice + "kr, tack!\nTack f�r det, ha en trevlig resa!");
				menu.Menu(); 
			} else {
				System.out.println("OK, d� blir det " + dicountSinglePrice + "kr, tack!\nTack f�r det, ha en trevlig resa!");
				menu.Menu();
			} 
			
		} else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("OK, Vill du ha ett m�nadskort f�r " + normalMonthPrice + " kr.\nEller ett eng�ngskort f�r " + normalSinglePrice + "kr?\nTryck 1 f�r m�nadskort.\nTryck 2 f�r eng�ngskort.");
			monthOrSingle = scanner.nextInt();
			if (monthOrSingle == 1) {
					System.out.println("OK, d� blir det " + discountMonthPrice + "kr, tack!\nTack f�r det, ha en trevlig resa!");
					menu.Menu(); 
			} else {
					System.out.println("OK, d� blir det " + dicountSinglePrice + "kr, tack!\nTack f�r det, ha en trevlig resa!");
					menu.Menu();
			}
		}
	}
}
