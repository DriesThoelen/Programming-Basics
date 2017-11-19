package be.pxl.h6.oef3;

import java.util.Scanner;

public class H6Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een tekst in");
		String tekst = keyboard.nextLine();
		String omgekeerd = "";
		
		int tekstlengte = tekst.length();
		
		for (int count = 0; count < tekstlengte; count++) {
			omgekeerd = tekst.charAt(count) + omgekeerd;
		}

		System.out.println("De omgekeerde tekst is : " + omgekeerd);
		keyboard.close();
	}
}