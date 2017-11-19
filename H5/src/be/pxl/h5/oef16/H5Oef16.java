package be.pxl.h5.oef16;

import java.util.Scanner;

public class H5Oef16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int inschrijvingsnummer;
		int inschrijvingsnummerSnelsteRennner = 0;
		int tijd;
		int tijdSnelsteRenner = Integer.MAX_VALUE;
		int tijdInSecondenSnelsteRenner;
		int tijdInMinutenSnelsteRenner;
		int tijdInUrenSnelsteRenner;
		int aantalRenners = 0;
		int aantalTrageRenners = 0;
		double percentTrageRenners;

		System.out.println("Geef het inschrijvingsnummer van de renner in");
		inschrijvingsnummer = keyboard.nextInt();

		while (inschrijvingsnummer > 0) {
			System.out.println("Geef de tijd van de renner in seconden");
			tijd = keyboard.nextInt();

			if (tijd > 3600) {
				aantalTrageRenners += 1;
			}

			if (tijd < tijdSnelsteRenner) {
				tijdSnelsteRenner = tijd;
				inschrijvingsnummerSnelsteRennner = inschrijvingsnummer;
			}

			aantalRenners += 1;

			System.out.println("Geef het inschrijvingsnummer van de renner in");
			inschrijvingsnummer = keyboard.nextInt();
		}
		
		tijdInMinutenSnelsteRenner = tijdSnelsteRenner / 60;
		tijdInSecondenSnelsteRenner = tijdSnelsteRenner % 60;
		tijdInUrenSnelsteRenner = tijdInMinutenSnelsteRenner / 60;
		tijdInMinutenSnelsteRenner -= (tijdInUrenSnelsteRenner * 60);

		percentTrageRenners = ((double) aantalTrageRenners / (double) aantalRenners) * 100;

		System.out.println("Snelste renner is de renner met inschrijvingsnummer: " + inschrijvingsnummerSnelsteRennner);
		System.out.println("Het percentage van de renners dat er langer dan 1 uur over doet: " + percentTrageRenners + " %");
		System.out.println("De tijd van de snelste renner is : " + tijdInUrenSnelsteRenner + " uren " + tijdInMinutenSnelsteRenner + " minuten " + tijdInSecondenSnelsteRenner + " seconden");
		keyboard.close();
	}
}