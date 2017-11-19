package be.pxl.h5.exoef17;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class H5ExOef17 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		df.setRoundingMode(RoundingMode.HALF_UP);

		System.out.println("Geef het rentepercentage in");
		double rentepercentage = keyboard.nextDouble();

		System.out.println("Geef het beginkapitaal in");
		double beginkapitaal = keyboard.nextDouble();

		double eindkapitaal = 0;
		double intrest = 0;
		int aantalJaren = 0;

		intrest = (1 + (rentepercentage / 100));

		while (eindkapitaal < (2 * beginkapitaal)) {
			eindkapitaal = beginkapitaal * intrest;
			++aantalJaren;
			intrest = intrest * (1 + (rentepercentage / 100));
		}

		if (aantalJaren == 1) {
			System.out.println("Het beginkapitaal moet " + aantalJaren + " jaar belegd worden aan de intrestvoet " + rentepercentage + " % vooralleer het beginkapitaal verdubbeld zal zijn. Het eindkapitaal bedraagt dan" + " € " + df.format(eindkapitaal) + ".");
		} else {
			System.out.println("Het beginkapitaal moet " + aantalJaren + " jaren belegd worden aan de intrestvoet " + rentepercentage + " % vooralleer het beginkapitaal verdubbeld zal zijn. Het eindkapitaal bedraagt dan" + " € " + df.format(eindkapitaal) + ".");
		}

		keyboard.close();

	}
}