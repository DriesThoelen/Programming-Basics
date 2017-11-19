package be.pxl.h5.exoef14;

import java.util.Scanner;

public class H5ExOef14 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int gesl;
		int conditiegetal;
		int aantalWerknemers = 0;
		int aantalWerknemersSlechteConditie = 0;
		double afgM;
		double afgKm;
		double percentWerknemersSlechteConditie;

		System.out.println("Geef het geslacht van de werknemer in (1 = man, 2 = vrouw)");
		gesl = keyboard.nextInt();

		while ((gesl == 1) || (gesl == 2)) {
			System.out.println("Geef de afstand in km afgelegd door de werknemer na 12 minuten lopen");
			afgKm = keyboard.nextDouble();

			afgM = afgKm * 1000;

			conditiegetal = (int) ((afgM - 504.9) / 44.73);

			if (gesl == 1) {
				if (conditiegetal < 36) {
					aantalWerknemersSlechteConditie += 1;
				}
			} else {
				if (conditiegetal < 29) {
					aantalWerknemersSlechteConditie += 1;
				}
			}

			aantalWerknemers += 1;

			System.out.println("Geef het geslacht van de werknemer in (1 = man, 2 = vrouw)");
			gesl = keyboard.nextInt();
		}

		percentWerknemersSlechteConditie = ((double) aantalWerknemersSlechteConditie / (double) aantalWerknemers) * 100;
		System.out.println(
				"Percentage werknemers die een slechte conditie hebben : " + percentWerknemersSlechteConditie + " %");

		keyboard.close();
	}
}