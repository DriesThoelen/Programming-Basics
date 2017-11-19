package be.pxl.h5.exoef5;

import java.util.Scanner;

public class H5ExOef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een geheel getal in");
		int getal = keyboard.nextInt();
		
		if (getal < 10) {
			System.out.println("00" + getal);
		} else {
			if (getal < 100) {
				System.out.println("0" + getal);
			} else {
				System.out.println(getal);
			}
		}
		
		keyboard.close();
	}
}