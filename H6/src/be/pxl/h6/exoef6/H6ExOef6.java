package be.pxl.h6.exoef6;

import java.util.Scanner;

public class H6ExOef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String productcode;

		do {
			System.out.println("Geef een productcode in");
			productcode = keyboard.nextLine();
		} while (!(controleerProductcode(productcode)));

		keyboard.close();
	}

	public static boolean controleerProductcode(String productcode) {
		if (productcode.length() == 8) {
			if ((productcode.indexOf("l") == 0) || (productcode.indexOf("L") == 0) || (productcode.indexOf("r") == 0) || (productcode.indexOf("R") == 0)) {
				if ((productcode.indexOf("bo") == 6) || (productcode.indexOf("on") == 6)) {
					return true;
				} else {
					System.err.println("Foutieve ingave. De productiecode eindigt niet op bo of on.");
					return false;
				}
			} else {
				System.err.println("Foutieve ingave. De productiecode begint niet met l, L, r of R.");
				return false;
			}
		} else {
			System.err.println("Foutieve ingave. De productiecode bevat niet het juist aantal tekens.");
			return false;
		}
	}
}