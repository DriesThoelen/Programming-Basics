package be.pxl.h5.exoef3;

import java.util.Scanner;

public class H5ExOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de lengte van het zwembad in m");
		double lengte = keyboard.nextDouble();
		
		System.out.println("Geef de breedte van het zwembad in m");
		double breedte = keyboard.nextDouble();
		
		System.out.println("Geef de diepte van het zwembad in m");
		double diepte = keyboard.nextDouble();
		
		double inhoudLiter = lengte * breedte * diepte * 1000;
		double aantalLiterWater = inhoudLiter * ((double) 98 / 100);
		double aantalLiterOntsmettingsmiddel = inhoudLiter * ((double) 2 / 100);
		
		System.out.println("Aantal liter water : " + (int)aantalLiterWater + " l");
		System.out.println("Aantal liter ontsmettingsmiddel : " + (int)aantalLiterOntsmettingsmiddel + " l");
		
		keyboard.close();
	}
}