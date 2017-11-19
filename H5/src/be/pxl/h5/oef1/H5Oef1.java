package be.pxl.h5.oef1;

import java.util.Scanner;

public class H5Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een bedrag (BEF) in");
		double bedragBEF = keyboard.nextDouble();

		final double CONVERSIEVARIABELEBEFNAAREURO = 40.3399;

		double bedragEuro = bedragBEF / CONVERSIEVARIABELEBEFNAAREURO;
		System.out.println("€" + bedragEuro);
		keyboard.close();
	}
}