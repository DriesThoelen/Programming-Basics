package be.pxl.h5.oef12;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class H5Oef12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.#");

		df.setRoundingMode(RoundingMode.HALF_UP);

		System.out.println("Geef het relatieve percentage van een gewicht op de maan ten opzichte van de aarde");
		double percentMaan = keyboard.nextDouble();
		System.out.println("Geef het relatieve percentage van een gewicht op Jupiter ten opzichte van de aarde");
		double percentJupiter = keyboard.nextDouble();
		System.out.println("Geef het relatieve percentage van een gewicht op Mars ten opzichte van de aarde");
		double percentMars = keyboard.nextDouble();
		System.out.printf("%1s%10s%10s%10s\n", "AARDE", "MAAN", "JUPITER", "MARS");
		for (int gewichtAarde = 50; gewichtAarde <= 120; gewichtAarde += 5) {
			double gewichtMaan = gewichtAarde * (percentMaan / 100);
			double gewichtJupiter = gewichtAarde * (percentJupiter / 100);
			double gewichtMars = gewichtAarde * (percentMars / 100);
			System.out.printf("%1s%12s%10s%11s\n", df.format(gewichtAarde), df.format(gewichtMaan),
					df.format(gewichtJupiter), df.format(gewichtMars));
		}
		keyboard.close();
	}
}