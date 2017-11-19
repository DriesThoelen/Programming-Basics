package be.pxl.h6.exoef5;

import java.util.Scanner;

public class H6ExOef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		StringBuilder tekstBuilder = new StringBuilder();

		System.out.println("Geef een tekst in");
		String tekst = keyboard.nextLine();

		System.out.println("Geef een teken in");
		char teken = keyboard.nextLine().charAt(0);

		tekstBuilder = vervangKlinkerDoorTeken(tekst, teken);

		System.out.println(tekstBuilder);
		
		keyboard.close();
	}

	public static StringBuilder vervangKlinkerDoorTeken(String tekst, char teken) {
		StringBuilder tekstBuilder = new StringBuilder();

		tekstBuilder.setLength(tekst.length());

		for (int count = 0; count < tekst.length(); count++) {
			if ((tekst.charAt(count) == 'A') || (tekst.charAt(count) == 'a') || (tekst.charAt(count) == 'E') || (tekst.charAt(count) == 'e') || (tekst.charAt(count) == 'I') || (tekst.charAt(count) == 'i') || (tekst.charAt(count) == 'O') || (tekst.charAt(count) == 'o') || (tekst.charAt(count) == 'U') || (tekst.charAt(count) == 'u')) {
				tekstBuilder.setCharAt(count, teken);		
			} else {
				tekstBuilder.setCharAt(count, tekst.charAt(count));
			}
		}
		
		return tekstBuilder;
	}
}