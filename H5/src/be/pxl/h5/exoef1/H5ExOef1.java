package be.pxl.h5.exoef1;

import java.util.Scanner;

public class H5ExOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het aantal graden Celsius in");
		double gradenCelsius = keyboard.nextDouble();
		
		double gradenFahrenheit = ((double) 9 / 5) * gradenCelsius + 32;
		
		System.out.println((int)gradenFahrenheit + " °F");
		
		keyboard.close();
	}
}