package be.pxl.h5.opdr13;

import java.util.Scanner;

public class H5Opdr13a {

	public static void main(String[] args) {
		Scanner	keyboard = new Scanner(System.in);
		int a;
		System.out.println("Geef een getal in: ");
		a = keyboard.nextInt();
//		while (a < 5)
//			System.out.println("Geef een ander getal in: ");
//			a = keyboard.nextInt();
		while (a < 5) {
			System.out.println("Geef een ander getal in: ");
			a = keyboard.nextInt();
		}
		
		keyboard.close();
	}
}