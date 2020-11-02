package com.projecttrainschool;

public class Main {

	public static void main(String[] args) {
		Passanger passanger = new Passanger("", 0);
		Menu menu = new Menu();
		Ticket ticket = new Ticket();
		
		menu.Menu();
		passanger.testPassanger();
		ticket.ShowPrice();
	}
}
