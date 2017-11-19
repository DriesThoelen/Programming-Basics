package be.pxl.h5.opdr11;

import java.util.Scanner;

public class H5Opdr11d {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef jouw gewicht in kg");
		double gewicht = keyboard.nextDouble();
		
		System.out.println("Geef jouw lengte in m");
		double lengte = keyboard.nextDouble();
		
		double bmi = gewicht / (lengte * lengte);
		
		System.out.println("Jouw BMI is: " +bmi);
		if (bmi < 18) {
			System.out.println("ondergewicht");
		} else {
			if (bmi <= 25) {
				System.out.println("ok");
			} else {
				if (bmi <= 30) {
					System.out.println("overgewicht");
				} else {
					if (bmi <= 40) {
						System.out.println("obesistas");
					} else {
						System.out.println("ziekelijk overgewicht");
					}
				}
			}
		}
		
		keyboard.close();
	}
}