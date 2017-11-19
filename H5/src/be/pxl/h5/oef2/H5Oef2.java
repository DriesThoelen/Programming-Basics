package be.pxl.h5.oef2;

import java.util.Scanner;

public class H5Oef2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		double eenheidsPrijs = 11.5;
		final double btwPercentage = 0.21;
		double bedragExclusiefBTW;
		double bedragBTW;
		double bedragInclusiefBTW;

		System.out.println("Geef het aantal te bestellen artikelen in");
		int aantal = keyboard.nextInt();

		bedragExclusiefBTW = aantal * eenheidsPrijs;
		bedragBTW = bedragExclusiefBTW * btwPercentage;
		bedragInclusiefBTW = bedragExclusiefBTW + bedragBTW;

		System.out.println("Totaal (excl. BTW): " + "€" + bedragExclusiefBTW);
		System.out.println("Aandeel in BTW : " + "€" + bedragBTW);
		System.out.println("Totaal (incl. BTW): " + "€" + bedragInclusiefBTW);
		keyboard.close();
	}
}