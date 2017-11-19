package be.pxl.h5.oef14;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class H5Oef14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		int artikelNummer;
		int hoeveelheid;
		double eenheidsprijs;
		double bedrag;
		double totaalprijs = 0;

		df.setRoundingMode(RoundingMode.HALF_UP);
		
		System.out.println("Geef het artikelnummer in");
		artikelNummer = keyboard.nextInt();

		while (artikelNummer != 999) {
			System.out.println("Geef de hoeveelheid in");
			hoeveelheid = keyboard.nextInt();
			System.out.println("Geef de eenheidsprijs in");
			eenheidsprijs = keyboard.nextDouble();

			bedrag = hoeveelheid * eenheidsprijs;
			totaalprijs += bedrag;

			System.out.println("artikelnummer : " + artikelNummer + "; " + "hoeveelheid : " + hoeveelheid + "; " + "eenheidsprijs : " + "€ " + df.format(eenheidsprijs) + "; " + "bedrag : " + "€ " + df.format(bedrag));

			System.out.println("Geef het artikelnummer in");
			artikelNummer = keyboard.nextInt();
		}

		System.out.println("Het totaal te betalen bedrag van deze aankoop :" + " € " + df.format(totaalprijs));
		keyboard.close();
	}
}