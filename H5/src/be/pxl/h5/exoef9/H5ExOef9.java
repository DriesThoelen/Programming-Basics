package be.pxl.h5.exoef9;

import java.util.Calendar;
import java.util.Scanner;

public class H5ExOef9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Calendar date = Calendar.getInstance();
		
		System.out.println("Geef je geboortedag in cijfers");
		int geboortedag = keyboard.nextInt();
		
		System.out.println("Geef je geboortemaand in cijfers");
		int geboortemaand = keyboard.nextInt();
		
		System.out.println("Geef je geboortejaar in cijfers");
		int geboortejaar = keyboard.nextInt();
		
//		System.out.println("Geef de huidige dag in cijfers");
//		int huidigeDag = keyboard.nextInt();
//		
//		System.out.println("Geef de huidige maand in cijfers");
//		int huidigeMaand = keyboard.nextInt();
//		
//		System.out.println("Geef het huidig jaartal in cijfers");
//		int huidigJaar = keyboard.nextInt();
		
		int huidigeDag = date.get(Calendar.DATE);
		
		int huidigeMaand = date.get(Calendar.MONTH) + 1;
		
		int huidigJaar = date.get(Calendar.YEAR);
		
		System.out.println("Datum vandaag : " + huidigeDag + "/" + huidigeMaand + "/" + huidigJaar);
		
		int leeftijd = huidigJaar - geboortejaar;
		
		if (huidigeMaand < geboortemaand) {
			leeftijd -= 1;
		} else {
			if (huidigeMaand == geboortemaand) {
				if (huidigeDag < geboortedag) {
					leeftijd -= 1;
				} else {
					if (huidigeDag == geboortedag) {
						System.out.println("Gelukkige verjaardag");
					}
				}
			}
		}
		
		if (leeftijd > 0) {
		System.out.println("Je bent " + leeftijd + " jaar oud");
		} else {
			System.out.println("Je bent nog niet geboren");
		}
		keyboard.close();
	}
}