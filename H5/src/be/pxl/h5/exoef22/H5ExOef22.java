package be.pxl.h5.exoef22;

import java.util.Scanner;

public class H5ExOef22 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef het hoeksymbool in");
		char hoeksymbool = keyboard.next(".").charAt(0);

		System.out.println("Geef het symbool voor de horizontale lijnen in");
		char horizontaalsymbool = keyboard.next(".").charAt(0);

		System.out.println("Geef het symbool voor de verticale lijnen in");
		char verticaalsymbool = keyboard.next(".").charAt(0);

		System.out.println("Geef het aantal rasters horizontaal");
		int aantalRastersHorizontaal = keyboard.nextInt();

		System.out.println("Geef het aantal rasters verticaal");
		int aantalRastersVerticaal = keyboard.nextInt();

//		tekenRaster(hoeksymbool, horizontaalsymbool, verticaalsymbool);
		tekenRasterMetAfmetingen(hoeksymbool, horizontaalsymbool, verticaalsymbool, aantalRastersHorizontaal, aantalRastersVerticaal);

		keyboard.close();
	}

/*	public static void tekenRaster(char hoeksymbool, char horizontaalsymbool, char verticaalsymbool) {

		for (int count = 1; count <= 4; count++) {
			for (int counthoek = 1; counthoek <= 5; counthoek++) {
				System.out.print(hoeksymbool);
				for (int counthorizontaal = 1; counthorizontaal <= 9; counthorizontaal++) {
					System.out.print(horizontaalsymbool);
				}
			}
			System.out.println(hoeksymbool);
			for (int countverticaal = 1; countverticaal <= 4; countverticaal++) {
				for (int countleegverticaal = 1; countleegverticaal <= 6; countleegverticaal++) {
					System.out.print(verticaalsymbool);
					for (int countleeg = 1; countleeg <= 9; countleeg++) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		for (int counthoek = 1; counthoek <= 5; counthoek++) {
			System.out.print(hoeksymbool);
			for (int counthorizontaal = 1; counthorizontaal <= 9; counthorizontaal++) {
				System.out.print(horizontaalsymbool);
			}
		}
		System.out.println(hoeksymbool);
	} */

	public static void tekenRasterMetAfmetingen(char hoeksymbool, char horizontaalsymbool, char verticaalsymbool, int aantalRastersHorizontaal, int aantalRastersVerticaal) {

		for (int count = 1; count <= aantalRastersVerticaal; count++) {
			for (int counthoek = 1; counthoek <= aantalRastersHorizontaal; counthoek++) {
				System.out.print(hoeksymbool);
				for (int counthorizontaal = 1; counthorizontaal <= 9; counthorizontaal++) {
					System.out.print(horizontaalsymbool);
				}
			}
			System.out.println(hoeksymbool);
			for (int countverticaal = 1; countverticaal <= 4; countverticaal++) {
				for (int countleegverticaal = 1; countleegverticaal <= (aantalRastersHorizontaal + 1); countleegverticaal++) {
					System.out.print(verticaalsymbool);
					for (int countleeg = 1; countleeg <= 9; countleeg++) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		for (int counthoek = 1; counthoek <= aantalRastersHorizontaal; counthoek++) {
			System.out.print(hoeksymbool);
			for (int counthorizontaal = 1; counthorizontaal <= 9; counthorizontaal++) {
				System.out.print(horizontaalsymbool);
			}
		}
		System.out.println(hoeksymbool);
	}
}