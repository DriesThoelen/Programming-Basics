package be.pxl.h4.oef6;

import java.util.Scanner;

public class H4Oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("geef een getal");
		int getal = keyboard.nextInt();

		for (int count = 1; count < 21; count++) {
			int tafel = count * getal;
			System.out.printf("%10s%10s%10s%10s%10s\n", count, "x", getal, "=", tafel);
		
			keyboard.close();
		}
	}

}
