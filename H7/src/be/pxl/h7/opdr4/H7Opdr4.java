package be.pxl.h7.opdr4;

import java.util.Scanner;

public class H7Opdr4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] aantalDagenVanDeMaand = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] maanden = { "Januari", "Februari", "Maart", "April", "Mei", "Juni", "Juli", "Augustus", "September", "Oktober", "November", "December" };
	
//		System.out.println("Geef een maandnummer in");
//		int maandnummer = keyboard.nextInt();
		
		int maandnummer = 0;
		
		System.out.println("Geef een maand in");
		String maand = keyboard.nextLine();
		
		for (int count = 0; count < maanden.length; count++) {
			if (maanden[count].equalsIgnoreCase(maand)) {
				maandnummer = count;
			}
		}
		
//		System.out.println(maanden[maandnummer - 1] + " bevat " + aantalDagenVanDeMaand[maandnummer - 1] + " dagen.");
		
		System.out.println(maanden[maandnummer] + " bevat " + aantalDagenVanDeMaand[maandnummer] + " dagen.");
		
		keyboard.close();
	}
}