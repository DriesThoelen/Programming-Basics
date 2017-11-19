package be.pxl.h5.opdr11;

import java.util.Scanner;

public class H5Opdr11a {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een getal a in");
		int a = keyboard.nextInt();
		
		if (a > 100) {
			System.out.println("a > 100");
		} else {
			if (a < 10) {
				System.out.println("a < 10");
			} else {
				System.out.println("a >= 10");
			}
		}
		
//		if (a > 100) {
//			System.out.println("a > 100");
//		}
//		if (a < 10) {
//			System.out.println("a < 10");
//		} else {
//			System.out.println("a >= 10");
//		}
		
		keyboard.close();
	}
}