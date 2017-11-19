package be.pxl.h5.oef7;

import java.util.Scanner;

public class H5Oef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double prijs;
		double prijsKlasse;

		System.out.println("Geef de afstand van de vlucht in km");
		int afstand = keyboard.nextInt();

		System.out.println("Geef de klasse vermeld op het vliegticket in (1 = toeristenklasse, 2 = charter en 3 = zakenreis)");
		int klasse = keyboard.nextInt();

		if (afstand > 2999) {
			prijs = 0.12 * afstand;
		} else {
			if (afstand > 1000) {
				prijs = 0.20 * afstand;
			} else {
				prijs = 0.25 * afstand;
			}
		}

		if (klasse == 3) {
			prijsKlasse = prijs * 0.30;
			prijs += prijsKlasse;
		} else {
			if (klasse == 2) {
				prijsKlasse = prijs * 0.20;
				prijs -= prijsKlasse;
			}
		}
		System.out.println("€ " + (int)prijs);
		keyboard.close();
	}
}