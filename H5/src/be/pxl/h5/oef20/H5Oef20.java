package be.pxl.h5.oef20;

import java.util.Scanner;

public class H5Oef20 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int ingevoerdgetal;

		System.out.println("Geef een getal in");
		ingevoerdgetal = keyboard.nextInt();

		while (ingevoerdgetal != 0) {
			int faculteit = berekenFaculteit(ingevoerdgetal);

			System.out.println(ingevoerdgetal + "!" + " = " + faculteit);

			System.out.println("Geef een getal in");
			ingevoerdgetal = keyboard.nextInt();
		}

		keyboard.close();
	}

	public static int berekenFaculteit(int ingevoerdgetal) {
		int getal;
		int faculteit = 1;
		getal = ingevoerdgetal;

		for (getal = 1; getal <= ingevoerdgetal; getal++) {
			faculteit *= getal;
		}

		return faculteit;

	}
}