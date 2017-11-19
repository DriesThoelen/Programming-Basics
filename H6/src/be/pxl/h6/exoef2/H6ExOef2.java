package be.pxl.h6.exoef2;

import java.util.Scanner;

public class H6ExOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een tekst in");
		String tekst = keyboard.nextLine();
		
		int tekstlengte = tekst.length();
		
		if (tekstlengte % 3 == 0) {
			tekst = tekst.toUpperCase();
		} else {
			tekst = tekst.toLowerCase();
		}

		System.out.println(tekst);
		
		keyboard.close();
	}
}