package be.pxl.h6.opdr3;

import java.util.Scanner;

public class H6Opdr3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String tekst = "The quick brown fox jumps over the lazy dog.";
		
		int lengte = tekst.length();
		
		System.out.println(tekst);
		System.out.println("Deze tekst bevat " + lengte + " karakters");
		
		tekst = tekst.toUpperCase();
		System.out.println(tekst);
		
		tekst = tekst.toLowerCase();
		System.out.println(tekst);
		
		tekst = tekst.replace('a', 'o');
		System.out.println(tekst);
		
		int countE = 0;
//		int position = tekst.indexOf("e");
		
//		while (position != -1) {
//			countE++;
//			position = tekst.indexOf("e", position + 1);
//		}
//		
//		System.out.println("Aantal letters 'e' : " + countE);
		
		for (int count = 0; count < lengte; count++) {
			if (tekst.charAt(count) == 'e') {
				countE++;
			}
		}
		
		System.out.println("Aantal letters 'e' : " + countE);
		
		String tekst1 = "Latijnse zin : Neque porro quisquam est qui dolorem ipsum duia dolor sit amet, consectetur, adipisci velit...";
		String tekst2 = "Nederlandse vertaling : Er is niemand die van pijn zelf houdt, die het zoekt en die het hebben wil, eenvoudigweg omdat het pijn is...";

		System.out.println(tekst1.equals(tekst2)); //False
		
		if ((tekst1.compareTo(tekst2) < 0)) {
			System.out.println(tekst1);
			System.out.println(tekst2);
		} else {
			System.out.println(tekst2);
			System.out.println(tekst1);
		}
		
		String tekst3 = "     Tekstvoorbeeld     ";
		System.out.println(tekst3.trim());
		
		System.out.println("Geef je voornaam in");
		String voornaam = keyboard.nextLine();
		System.out.println("Geef je naam in");
		String naam = keyboard.nextLine();
		
		String voornaamEnAchternaam = String.join(". ", voornaam.substring(0, 1).toUpperCase(), String.join("", naam.substring(0, 1).toUpperCase(), naam.substring(1).toLowerCase()));
		System.out.println(voornaamEnAchternaam);
		
		System.out.println("Geef een woord in");
		String woord = keyboard.nextLine();
		
		int woordlengte = woord.length();
		int middelsteLetter = woordlengte / 2;
		
		if (woordlengte % 2 == 0) {
			System.out.println(String.join("", woord.substring(0, middelsteLetter - 1), woord.substring(middelsteLetter - 1, middelsteLetter + 1).toUpperCase(), woord.substring(middelsteLetter + 1)));
		} else {
			System.out.println(String.join("", woord.substring(0, middelsteLetter), woord.substring(middelsteLetter, middelsteLetter + 1).toUpperCase(), woord.substring(middelsteLetter + 1)));
		}
		
		keyboard.close();
	}
}