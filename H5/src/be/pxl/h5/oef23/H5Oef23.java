package be.pxl.h5.oef23;

import java.util.Scanner;

public class H5Oef23 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef de grootte van de driehoek");
		int grootte = keyboard.nextInt();

		tekenDriehoek(grootte);

		keyboard.close();
	}

	public static void tekenDriehoek(int grootte) {

		for (int rij = 0; rij < grootte; rij++) {
			System.out.println();
			for (int kolom = 0; kolom < grootte - rij; kolom++) {
				System.out.print("@ ");
			}
		}
	}
}