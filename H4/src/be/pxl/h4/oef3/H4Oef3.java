package be.pxl.h4.oef3;

import java.util.Scanner;

public class H4Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Aantal goederen?");
		int aantal = keyboard.nextInt();

		System.out.println("Eenheidsprijs?");
		int eenheidsprijs = keyboard.nextInt();

		int totaalprijs = (aantal * eenheidsprijs);

		int bedrag;

		int korting;

		bedrag = totaalprijs;

		if (totaalprijs > 999) {
			korting = 22;
		} else {
			if (totaalprijs > 500) {
				korting = 10;
			} else {
				korting = 0;
			}
		}

		bedrag = totaalprijs - korting;

		System.out.println("te betalen bedrag is " + bedrag);
		keyboard.close();
	}
}