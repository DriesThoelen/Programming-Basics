package be.pxl.h5.exoef13;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class H5ExOef13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		df.setRoundingMode(RoundingMode.HALF_UP);

		System.out.println("Geef het beginkapitaal in");
		double beginkapitaal = keyboard.nextDouble();

		System.out.println("Geef de intrestvoet in");
		double intrestvoet = keyboard.nextDouble();

		System.out.println("Geef het aantal jaren in");
		int aantalJaren = keyboard.nextInt();

		double intrest;
		double eindkapitaal;

		intrest = (1 + (intrestvoet / 100));

		for (int count = 0; count < aantalJaren; count++) {
			eindkapitaal = beginkapitaal * intrest;
			System.out.println("€ " + df.format(eindkapitaal));
			intrest = intrest * (1 + (intrestvoet / 100));
		}

		keyboard.close();
	}
}