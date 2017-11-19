package be.pxl.h5.exoef2;

import java.util.Scanner;

public class H5ExOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het aantal graden Fahrenheit in");
		double gradenFahrenheit = keyboard.nextDouble();
		
		double gradenCelsius = (double) 5 / 9 * (gradenFahrenheit - 32);
		
		System.out.println((int)gradenCelsius + " °C");
		
		keyboard.close();
	}
}