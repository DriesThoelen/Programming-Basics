package be.pxl.h4.oef2;

import java.util.Scanner;

public class H4Oef2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("a is gelijk aan");
		int a = keyboard.nextInt();

		System.out.println("b is gelijk aan");
		int b = keyboard.nextInt();

		int grgetal;
		int klgetal;

		if (a > b) {
			grgetal = a;
			klgetal = b;
		} else {
			grgetal = b;
			klgetal = a;
		}

		int som1 = grgetal - klgetal;
		int som2 = som1 * 5;

		System.out.println(grgetal + " - " + klgetal + " = " + som1);
		System.out.println(som1 + " x " + 5 + " = " + som2);

		keyboard.close();
	}
}