package be.pxl.h6.oef4;

import java.util.Scanner;

public class H6Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een tekst in");
		String tekst1 = keyboard.nextLine();
		
		System.out.println("Geef een tekst in");
		String tekst2 = keyboard.nextLine();
		
		String tekst;
		
		String string1 = tekst1 + "****";
		String string2 = "++++" + tekst2;
		
		int string2lengte = string2.length();
		
		tekst = String.join("", string1.substring(0, 4).toUpperCase(), string2.substring(string2lengte - 4).toLowerCase());
			
		System.out.println(tekst);
		
		keyboard.close();
	}
}