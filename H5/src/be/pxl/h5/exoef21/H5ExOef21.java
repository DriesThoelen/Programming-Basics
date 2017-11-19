package be.pxl.h5.exoef21;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class H5ExOef21 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		DecimalFormat gf = new DecimalFormat("#");

		df.setRoundingMode(RoundingMode.HALF_UP);
		gf.setRoundingMode(RoundingMode.HALF_UP);

		int aantalLidMutualiteit = 0;
		int aantalVervoerdeSlachtoffers = 0;
		double percentageLidMutualiteit;
		double prijsPerSlachtoffer;
		
		System.out.println("Geef het rijkregisternummer van het slachtoffer in (11 cijfers, aan elkaar vast) (Om het programma te stoppen, typ 9999)");
		long rijkregisternummer = keyboard.nextLong();

		while (rijkregisternummer != 9999) {
			System.out.println("Geef het type medisch urgent vervoer in (0 = reanimatiewagen, 1 = ziekenwagen)");
			int typeVervoer = keyboard.nextInt();

			System.out.println("Geef de afstand in km");
			double afstandKm = keyboard.nextDouble();

			System.out.println("Geef in of het slachtoffer al dan niet lid is van een mutualiteit (0 = nee, 1 = ja)");
			int lidMutualiteit = keyboard.nextInt();

			if (lidMutualiteit == 1) {
				aantalLidMutualiteit += 1;
			}
			
			String rijksregisternummerString = Long.toString(rijkregisternummer);
			
			aantalVervoerdeSlachtoffers += 1;
			
			prijsPerSlachtoffer = berekenPrijsPerSlachtoffer(typeVervoer, afstandKm, lidMutualiteit);
			System.out.println("Rijkregisternummer slachtoffer : " + String.format("%s.%s.%s-%s.%s", rijksregisternummerString.substring(0, 2), rijksregisternummerString.substring(2, 4), rijksregisternummerString.substring(4, 6), rijksregisternummerString.substring(6, 9), rijksregisternummerString.substring(9, 11)));
			System.out.println("Te betalen : " + "€ " + df.format(prijsPerSlachtoffer));
			
			System.out.println("Geef het rijkregisternummer van het slachtoffer in (Om het programma te stoppen, typ 9999)");
			rijkregisternummer = keyboard.nextLong();
		}

		percentageLidMutualiteit = ((double) aantalLidMutualiteit / (double) aantalVervoerdeSlachtoffers) * 100;
		System.out.println("Aantal vervoerde slachtoffers : " + aantalVervoerdeSlachtoffers);
		System.out.println("Percentage lid van mutualiteit : " + gf.format(percentageLidMutualiteit) + " %");
		keyboard.close();
	}

	public static double berekenPrijsPerSlachtoffer(int typeVervoer, double afstandKm, int lidMutualiteit) {
		double prijsPerSlachtoffer = 0;
		double terugbetalingMutualiteit = 0;
		Scanner keyboard = new Scanner(System.in);

		if (lidMutualiteit == 1) {
			if (typeVervoer == 0) {
				if (afstandKm < 11) {
					terugbetalingMutualiteit = 15;
				} else {
						terugbetalingMutualiteit = 15 + ((afstandKm - (afstandKm - 10)) * 1.5);
				}
			} else {
				if (typeVervoer == 1) {
					if (afstandKm < 11) {
						terugbetalingMutualiteit = 10;
					} else {
							terugbetalingMutualiteit = 10 + ((afstandKm - (afstandKm - 10)) * 1);
					}
				} else {
					System.out.println("Geef een geldige waarde in");
					System.out.println("Geef het type medisch urgent vervoer in (0 = reanimatiewagen, 1 = ziekenwagen)");
					typeVervoer = keyboard.nextInt();
					berekenPrijsPerSlachtoffer(typeVervoer, afstandKm, lidMutualiteit);
					keyboard.close();
				}
			}
		} else {
			if (lidMutualiteit != 0) {
				System.out.println("Geef een geldige waarde in");
				System.out.println("Geef in of het slachtoffer al dan niet lid is van een mutualiteit (0 = nee, 1 = ja)");
				lidMutualiteit = keyboard.nextInt();
				berekenPrijsPerSlachtoffer(typeVervoer, afstandKm, lidMutualiteit);
				keyboard.close();
			}
		}
		
		if (typeVervoer == 0) {
			if (afstandKm < 11) {
				prijsPerSlachtoffer = 25 + (afstandKm * 2.25) - terugbetalingMutualiteit;
			} else {
				if (afstandKm < 21) {
					prijsPerSlachtoffer = 25 + (10 * 2.25) + ((afstandKm - (afstandKm - 10)) * 1.75) - terugbetalingMutualiteit;
				} else {
					prijsPerSlachtoffer = 25 + (10 * 2.25) + ((afstandKm - (afstandKm - 10)) * 1.75) + ((afstandKm - (afstandKm - 21)) * 1.15) - terugbetalingMutualiteit;
				}
			}
		} else {
			if (typeVervoer == 1) {
				if (afstandKm < 11) {
					prijsPerSlachtoffer = 20 + (afstandKm * 2.25) - terugbetalingMutualiteit;
				} else {
					if (afstandKm < 21) {
						prijsPerSlachtoffer = 20 + (10 * 2.25) + ((afstandKm - (afstandKm - 10)) * 1.75) - terugbetalingMutualiteit;
					} else {
						prijsPerSlachtoffer = 20 + (10 * 2.25) + (20 * 1.75) + ((afstandKm - (afstandKm - 30)) * 1.15) - terugbetalingMutualiteit;
					}
				}
			} else {
				System.out.println("Geef een geldige waarde in");
				System.out.println("Geef het type medisch urgent vervoer in (0 = reanimatiewagen, 1 = ziekenwagen)");
				typeVervoer = keyboard.nextInt();
				berekenPrijsPerSlachtoffer(typeVervoer, afstandKm, lidMutualiteit);
				keyboard.close();
			}
		}

		return prijsPerSlachtoffer;
	}
}