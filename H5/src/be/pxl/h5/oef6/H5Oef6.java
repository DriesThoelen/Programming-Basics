package be.pxl.h5.oef6;

import java.util.Scanner;

public class H5Oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double eenheidsPrijs = 11.5;

		final double btwPercentage = 0.21;
		double bedragExclusiefBTW;
		double bedragBTW;
		double bedragInclusiefBTW;
		final double KORTING = 0.10;
		double bedragKorting;

		System.out.println("Geef het aantal te bestellen artikels in");
		int aantal = keyboard.nextInt();

		bedragExclusiefBTW = aantal * eenheidsPrijs;
		bedragBTW = bedragExclusiefBTW * btwPercentage;
		bedragInclusiefBTW = bedragExclusiefBTW + bedragBTW;

		if (bedragInclusiefBTW > 1000) {
			bedragKorting = bedragInclusiefBTW * KORTING;
			bedragInclusiefBTW -= bedragKorting;
		}

		System.out.println("Totaal (incl. BTW en evt. korting) : " + "€" + bedragInclusiefBTW);
		keyboard.close();
	}
}