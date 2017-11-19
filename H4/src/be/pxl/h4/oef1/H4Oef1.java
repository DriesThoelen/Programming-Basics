package be.pxl.h4.oef1;

import java.util.Scanner;

public class H4Oef1 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef het aantal volwassenen");
		int adult = keyboard.nextInt();

		System.out.println("Geef het aantal kinderen");
		int child = keyboard.nextInt();

		int som = adult * 28 + child * 15;
		System.out.println("Het totale te betalen bedrag is " + som);

		keyboard.close();
	}
}