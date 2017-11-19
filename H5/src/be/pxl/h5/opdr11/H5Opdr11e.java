package be.pxl.h5.opdr11;

import java.util.Scanner;

public class H5Opdr11e {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef jouw burgerlijke staat in (1 = ongehuwd; 2 = gehuwd; 3 = weduwe(naar)");
		int burgerlijkeStaat = keyboard.nextInt();

		System.out.println("Geef jouw leeftijd in");
		int leeftijd = keyboard.nextInt();

		int lidgeld;

//		if (burgerlijkeStaat == 1) {
//			lidgeld = 25;
//		} else {
//			if (burgerlijkeStaat == 2) {
//				lidgeld = 20;
//			} else {
//				lidgeld = 15;
//			}
//		}
		
//		if (burgerlijkeStaat == 1 && leeftijd < 30) {
//				lidgeld = 25;
//			} else {
//				lidgeld = 15;
//			}

		
//		if (burgerlijkeStaat == 1 || leeftijd < 30) {
//				lidgeld = 25;
//			} else {
//				lidgeld = 15;
//			}
//		}

		if (burgerlijkeStaat == 1) {
			lidgeld = 25;
		} else {
			if (burgerlijkeStaat == 2 && leeftijd < 30) {
					lidgeld = 20;
			} else {
				lidgeld = 15;
			}
		}
		
		System.out.println("jaarlijks lidgeld : " + lidgeld + " euro");
		keyboard.close();
	}
}