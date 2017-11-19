package be.pxl.h4.opdr2;

import java.util.Scanner;

public class H4Opdr2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een eerste getal");
		int getal1 = keyboard.nextInt();

		System.out.println("Geef een tweede getal");
		int getal2 = keyboard.nextInt();

		int som = getal1 + getal2;
		System.out.println("De som is " + som);

		keyboard.close();
	}
}