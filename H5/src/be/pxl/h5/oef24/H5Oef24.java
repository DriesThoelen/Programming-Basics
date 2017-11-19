package be.pxl.h5.oef24;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class H5Oef24 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		Calendar date = Calendar.getInstance();

		df.setRoundingMode(RoundingMode.HALF_UP);

		System.out.println("Geef het aantal films in die je wilt huren");
		int aantalFilms = keyboard.nextInt();
		
		int huidigJaar = date.get(Calendar.YEAR);

		double totaalprijs = 0;
		double gemiddeldeKostPrijs = 0;

		for (int count = 1; count <= aantalFilms; count++) {
			System.out.println("Geef het genrenummer in");
			int genrenummer = keyboard.nextInt();

			System.out.println("Geef het aantal sterren in");
			int aantalSterren = keyboard.nextInt();

			System.out.println("Geef het jaar van uitgave in");
			int uitgavejaar = keyboard.nextInt();

			System.out.println("Geef de speeltijd in minuten in");
			int speeltijd = keyboard.nextInt();

			int leeftijdFilm = huidigJaar - uitgavejaar;

			double huurprijs = berekenHuurprijs(genrenummer, aantalSterren, leeftijdFilm, speeltijd);
			int huurtijd = berekenHuurtijd(genrenummer, aantalSterren, leeftijdFilm);

			totaalprijs += huurprijs;

			System.out.println("Film" + count + "\t" + "€ " + huurprijs + "\t" + huurtijd + " dag(en)");
		}

		gemiddeldeKostPrijs = totaalprijs / aantalFilms;

		System.out.println("Te betalen: " + "€ " + totaalprijs);
		System.out.println("Gemiddelde kostprijs per film: " + "€ " + df.format(gemiddeldeKostPrijs));

		keyboard.close();
	}

	public static double berekenHuurprijs(int genrenummer, int aantalSterren, int leeftijdFilm, int speeltijd) {
		double huurprijs;
		double korting = 0;

		if (leeftijdFilm > 10) {
			korting = 0.5;
		}

		if ((genrenummer / 10000) == 1) {
			huurprijs = 0.005 * speeltijd;
		} else {
			if (aantalSterren > 3) {
				huurprijs = 4.5 - korting;
			} else {
				if (aantalSterren > 1) {
					huurprijs = 3.75 - korting;
				} else {
					huurprijs = 3 - korting;
				}
			}
		}

		return huurprijs;
	}

	public static int berekenHuurtijd(int genrenummer, int aantalSterren, int leeftijdFilm) {
		int huurtijd;

		if ((leeftijdFilm <= 2) && (aantalSterren == 5 || (genrenummer / 10000) == 5)) {
			huurtijd = 1;
		} else {
			huurtijd = 2;
		}
		return huurtijd;
	}
}