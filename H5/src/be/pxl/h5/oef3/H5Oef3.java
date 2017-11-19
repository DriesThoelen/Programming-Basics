package be.pxl.h5.oef3;

import java.util.Scanner;

public class H5Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef het aantal afgelegde km per jaar in");
		double afgKm = keyboard.nextDouble();

		System.out.println("Geef het verbruik in l per 100 km in");
		double verbruik = keyboard.nextDouble();

		System.out.println("Geef de prijs van 1 l brandstof in");
		double prijsL = keyboard.nextDouble();

		double verbruiksKosten = afgKm * (verbruik / 100) * prijsL;
		double kostprijsKm = (verbruik / 100) * prijsL;

		System.out.println("de totale verbruikkosten per jaar : " + "€" + verbruiksKosten);
		System.out.println("de kostprijs per km : " + "€" + kostprijsKm);

		keyboard.close();
	}
}