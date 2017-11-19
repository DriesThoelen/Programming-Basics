package be.pxl.h5.exoef20;

import java.util.Scanner;

public class H5ExOef20 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int hoogte;

		System.out.println("Geef de lengte in van de rechthoek");
		int lengteinput = keyboard.nextInt();

		System.out.println("Geef de hoogte in van de rechthoek");
		int hoogteinput = keyboard.nextInt();

		hoogte = hoogteinput;

		tekenGevuldeRechthoek(hoogte, lengteinput);
		
		System.out.println();
		
		tekenLegeRechthoek(hoogte, lengteinput, hoogteinput);
		
		keyboard.close();
	}

	public static void tekenGevuldeRechthoek(int hoogte, int lengteinput) {
		int lengte;
		
		while (hoogte != 0) {
			lengte = (lengteinput - 1);
			while (lengte > 0) {
				System.out.print(" * ");
				lengte--;
			}
			System.out.println(" * ");
			hoogte--;
		}
	}
	
	public static void tekenLegeRechthoek(int hoogte, int lengteinput, int hoogteinput) {
		int lengte;
		do {
			lengte = (lengteinput - 1);
			do {
				System.out.print(" * ");
				while ((lengte > 1) && (!((hoogte == hoogteinput) || (hoogte == 1)))) {
					System.out.print("   ");
					lengte--;
				}
				lengte--;
			} while ((lengte > 0) && ((hoogte == hoogteinput) || (hoogte == 1)));
			System.out.println(" * ");
			hoogte--;
		} while (hoogte != 0);
	}
}