package be.pxl.h5.oef19;

import java.util.Scanner;

public class H5Oef19 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef de grootte van de driehoek");
		int grootte = keyboard.nextInt();
		
		for (int rij = 0; rij < grootte; rij++) {
			System.out.println();
			for (int kolom = 0; kolom < grootte - rij; kolom++) {
				System.out.print("@ ");
			}
		}

		keyboard.close();
	}
}