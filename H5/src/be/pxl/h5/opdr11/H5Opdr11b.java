package be.pxl.h5.opdr11;

import java.util.Scanner;

public class H5Opdr11b {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een getal x in");
		int x = keyboard.nextInt();
		
		int b;
		int a;
		
//		if (x != 1) {
//			b = x;
//			System.out.println(b);
//		}
//		if (x == 2) {
//			a = x;
//			System.out.println(a);
//		}

		if (x != 1) {
			b = x;
		System.out.println(b);
		} else {
			if (x == 2) {
				a = x;
		System.out.println(a);
			}
		}
		
		keyboard.close();
	}
}