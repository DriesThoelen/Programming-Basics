package be.pxl.h5.exoef12;

import java.util.Scanner;

public class H5ExOef12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int arbeidsNummer;
		int aantalGewerkteUren;
		double uurloon;
		double weekloon;
		
		System.out.println("Geef het arbeidsnummer van een arbeider in");
		arbeidsNummer = keyboard.nextInt();
		
		while (arbeidsNummer != 0) {
			System.out.println("Geef het uurloon van de arbeider in");
			uurloon = keyboard.nextDouble();

			System.out.println("Geef het aantal gewerkte uren die de arbeider in de week gewerkt heeft");
			aantalGewerkteUren = keyboard.nextInt();

			weekloon = uurloon * aantalGewerkteUren;

			if (aantalGewerkteUren > 38) {
				weekloon += (weekloon * 0.50);
			}
			System.out.println("Nummer van de arbeider : " + arbeidsNummer);
			System.out.println("Weekloon van de arbeider : " + "€ " + weekloon);
			
			System.out.println("Geef het arbeidsnummer van een arbeider in");
			arbeidsNummer = keyboard.nextInt();
		}

		keyboard.close();
	}
}