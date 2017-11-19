package be.pxl.h5.oef18;

import java.util.Scanner;

public class H5Oef18 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int faculteit = 1;
		int ingevoerdgetal;
		int getal;
		
		System.out.println("Geef een getal in");
		ingevoerdgetal = keyboard.nextInt();
		
		while (ingevoerdgetal != 0) {
			faculteit = 1;
			for (getal = 1; getal <= ingevoerdgetal; getal++) {
				faculteit *= getal;
			}

			System.out.println(ingevoerdgetal + "!" + " = " + faculteit);

			System.out.println("Geef een getal in");
			ingevoerdgetal = keyboard.nextInt();
		}

		keyboard.close();
	}
}