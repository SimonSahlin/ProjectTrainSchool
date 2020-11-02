package com.projecttrainschool;

public class Main {

	public static void main(String[] args) {

		Menu menu = new Menu();
		Ticket ticket = new Ticket();
		
		menu.Menu();
		ticket.ShowPrice();
	}

}
