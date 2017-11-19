package be.pxl.h4.exoef1;

import java.util.Scanner;

public class H4ExOef1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een getal 1 in");
		int getal1 = keyboard.nextInt();

		System.out.println("Geef een getal 2 in");
		int getal2 = keyboard.nextInt();

		int klgetal;

		if (getal1 > getal2) {
			klgetal = getal2;
		} else {
			klgetal = getal1;
		}

		System.out.println("Het kleinste getal is " + klgetal);
		int kwklgetal = klgetal * klgetal;
		System.out.println("Het kwadraat van het kleinste getal is " + kwklgetal);

		keyboard.close();
	}
}