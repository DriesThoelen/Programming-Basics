package be.pxl.h5.oef25;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class H5Oef25 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		df.setRoundingMode(RoundingMode.HALF_UP);

		System.out.println("Geef uw geslacht in (0 = vrouw, 1 = man, 2 = einde programma)");
		int geslacht = keyboard.nextInt();

		int aantalPersonen = 0;
		int aantalMannen = 0;
		int aantalVrouwen = 0;
		int aantalZwarePersonen = 0;
		double percentageZwarePersonen;
		double totaleLengteAlleVrouwen = 0;
		double lengteMan = 0;
		double gemiddeldeLengteVrouwen;
		double kleinsteLengteMannen = Double.MAX_VALUE;

		while (geslacht != 2) {
			if ((geslacht == 0) || (geslacht == 1)) {
				System.out.println("Geef uw lengte in meter");
				double lengte = keyboard.nextDouble();

				while ((lengte <= 0) || (lengte > 2.72)) {
					System.out.println("Ongeldige waarde voor lengte");
					System.out.println("Geef uw lengte in meter");
					lengte = keyboard.nextDouble();
				}

				System.out.println("Geef uw gewicht in kilogram");
				double gewicht = keyboard.nextDouble();

				while ((gewicht <= 0) || (gewicht > 635)) {
					System.out.println("Ongeldige waarde voor lengte");
					System.out.println("Geef uw gewicht in kilogram");
					gewicht = keyboard.nextDouble();
				}

				int BMI = berekenBMI(lengte, gewicht);

				interpreteerBMI(BMI);

				if (BMI >= 25) {
					aantalZwarePersonen += 1;
				}

				if (geslacht == 0) {
					aantalVrouwen += 1;
					totaleLengteAlleVrouwen += lengte;
				} else {
					aantalMannen += 1;
					lengteMan = lengte;
					if (lengteMan < kleinsteLengteMannen) {
						kleinsteLengteMannen = lengteMan;
					}
				}

				aantalPersonen += 1;

			} else {
				System.out.println("Foutief geslacht ingegeven.");
			}

			System.out.println("Geef uw geslacht in (0 = vrouw, 1 = man, 2 = einde programma)");
			geslacht = keyboard.nextInt();
		}

		percentageZwarePersonen = ((double) aantalZwarePersonen / (double) aantalPersonen) * 100;
		gemiddeldeLengteVrouwen = totaleLengteAlleVrouwen / aantalVrouwen;
		System.out.println("Het percentage personen die te zwaar wegen : " + df.format(percentageZwarePersonen) + " %");
		System.out.println("De gemiddelde lengte van de vrouwen : " + df.format(gemiddeldeLengteVrouwen) + " meter");

		if (aantalMannen != 0) {
			System.out.println("De kleinste lengte van de mannen : " + df.format(kleinsteLengteMannen) + " meter");
		}

		keyboard.close();
	}

	public static int berekenBMI(double lengte, double gewicht) {
		int BMI = (int) (gewicht / (lengte * lengte));

		return BMI;
	}

	public static void interpreteerBMI(int BMI) {

		System.out.println("BMI : " + BMI);

		if (BMI < 18) {
			System.out.println("Ondergewicht");
		} else {
			if (BMI < 25) {
				System.out.println("Normaal gewicht");
			} else {
				if (BMI < 27) {
					System.out.println("Neiging tot overgewicht");
				} else {
					if (BMI < 30) {
						System.out.println("Overgewicht");
					} else {
						if (BMI < 40) {
							System.out.println("Zwaarlijvigheid (obesitas)");
						} else {
							System.out.println("Ernstige zwaarlijvigheid");
						}
					}
				}
			}
		}
	}
}