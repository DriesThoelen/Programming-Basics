package be.pxl.h5.exoef16;

import java.util.Scanner;

public class H5ExOef16 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int lengte;
		int hoogte;

		System.out.println("Geef de lengte in van de rechthoek");
		int lengteinput = keyboard.nextInt();

		System.out.println("Geef de hoogte in van de rechthoek");
		int hoogteinput = keyboard.nextInt();

		hoogte = hoogteinput;
		
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
		
		keyboard.close();
	}
}