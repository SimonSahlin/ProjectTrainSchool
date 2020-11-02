package com.projecttrainschool;

import java.util.Scanner;

public class Ticket {
	
	Menu menu = new Menu();
	int dicountSinglePrice = 20;
	int discountMonthPrice = 450; 
	int normalSinglePrice = 35; 
	int normalMonthPrice = 600; 
	int monthOrSingle; 
	Passanger passanger; 
	
	public Ticket (Menu menu, Passanger passanger) {
		this.menu = menu;
		this.passanger = passanger; 
	}

	public void ShowPrice() {
		if (passanger.getAge() < 18 || passanger.getAge() > 64) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Tack, du kvalificeras för ett rabatterat pris, vill du ha ett månadskort för " + discountMonthPrice + " kr. Eller ett engångskort för " + dicountSinglePrice + "kr?\nTryck 1 för månadskort.\nTryck 2 för engångskort.");
			monthOrSingle = scanner.nextInt();
			if (monthOrSingle == 1) {
				System.out.println("OK, då blir det " + discountMonthPrice + "kr, tack!\nTack för det, ha en trevlig resa!\n");
				menu.Menu(); 
			} else {
				System.out.println("OK, då blir det " + dicountSinglePrice + "kr, tack!\nTack för det, ha en trevlig resa!\n");
				menu.Menu(); 
			} 

		} else {
			Scanner scanner = new Scanner(System.in);
			System.out.println("OK, Vill du ha ett månadskort för " + normalMonthPrice + " kr. Eller ett engångskort för " + normalSinglePrice + "kr?\nTryck 1 för månadskort.\nTryck 2 för engångskort.");
			monthOrSingle = scanner.nextInt();
			if (monthOrSingle == 1) {
					System.out.println("OK, då blir det " + discountMonthPrice + "kr, tack!\nTack för det, ha en trevlig resa!\n");
					menu.Menu(); 
			} else {
					System.out.println("OK, då blir det " + dicountSinglePrice + "kr, tack!\nTack för det, ha en trevlig resa!\n");
					menu.Menu();
			}
		}
	}
}
