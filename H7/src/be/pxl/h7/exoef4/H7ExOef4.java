package be.pxl.h7.exoef4;

import java.util.Scanner;

public class H7ExOef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		char[] letters = { 'z', 'b', 'r', 'o', 'g', 'G', 'B', 'V', 'L', 'W' };
		String controleLetters = new String(letters);
		long R;
		char a;
		char b;
		char c;
		int aWaarde = 0;
		int bWaarde = 0;
		int cWaarde = 0;
		
		do {
			System.out.println("Geef het 1ste karakter in");
			a = keyboard.nextLine().charAt(0);
		} while(!(controleerInvoerA(a, controleLetters)));
		
		do {
			System.out.println("Geef het 2de karakter in");
			b = keyboard.nextLine().charAt(0);
		} while(!(controleerInvoerB(b, controleLetters)));
		
		do {
			System.out.println("Geef het 3de karakter in");
			c = keyboard.nextLine().charAt(0);
		} while(!(controleerInvoerC(c, controleLetters)));
			
		for(int waarde = 0; waarde < letters.length; waarde++) {
			if (letters[waarde] == a) {
				aWaarde = waarde;
			}
			if (letters[waarde] == b) {
				bWaarde = waarde;
			}
			if (letters[waarde] == c) {
				cWaarde = waarde;
			}
		}
		
		
		long tienTotDeMachtCWaarde = berekenTienTotDeMachtCWaarde(cWaarde);
		
		R = (10 * aWaarde + bWaarde) * tienTotDeMachtCWaarde;
		
		System.out.println("De weerstand R bedraagt " + R + " ohm");
		
		keyboard.close();
	}
	
	public static boolean controleerInvoerA(char a, String controleLetters) {
		CharSequence aSequence = Character.toString(a);	
		
		if (controleLetters.contains(aSequence)) {
				return true;
			} else {
				System.err.println("Foutieve ingave. Het 1ste karakter behoort niet tot de volgende karakters : " + controleLetters);
				return false;
		}
	}
	
	public static boolean controleerInvoerB(char b, String controleLetters) {
		CharSequence bSequence = Character.toString(b);	
		
		if (controleLetters.contains(bSequence)) {
				return true;
			} else {
				System.err.println("Foutieve ingave. Het 2de karakter behoort niet tot de volgende karakters : " + controleLetters);
				return false;
		}
	}
	
	public static boolean controleerInvoerC(char c, String controleLetters) {
		CharSequence cSequence = Character.toString(c);	
		
		if (controleLetters.contains(cSequence)) {
				return true;
			} else {
				System.err.println("Foutieve ingave. Het 3de karakter behoort niet tot de volgende karakters : " + controleLetters);
				return false;
		}
	}
	
	public static long berekenTienTotDeMachtCWaarde(int cWaarde) {
		long tienTotDeMachtCWaarde = 1L;
		
		for(int count = 0; count < cWaarde; count++) {
			tienTotDeMachtCWaarde *= 10;
		}
		
		return tienTotDeMachtCWaarde;
	}
}