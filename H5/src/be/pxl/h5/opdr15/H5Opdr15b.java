package be.pxl.h5.opdr15;

import java.util.Scanner;

public class H5Opdr15b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int g;
		int tot = 0;
		int i = 12;
		
		do {
			System.out.println("Geef een getal in");
			g = keyboard.nextInt();
			tot = tot + g;
			System.out.println(tot);
			i = i - 2;
//		} while (i != 9) ;
		} while (i > 7) ;
		
		
//		for(int i = 12; i > 7; i = i - 2) {
//			System.out.println("Geef een getal in");
//			g = keyboard.nextInt();
//			tot = tot + g;
//			System.out.println(tot);
//		}
		
//		while (i > 7) {
//			System.out.println("Geef een getal in");
//			g = keyboard.nextInt();
//			tot = tot + g;
//			System.out.println(tot);
//			i = i - 2;
//		}

		keyboard.close();
	}
}