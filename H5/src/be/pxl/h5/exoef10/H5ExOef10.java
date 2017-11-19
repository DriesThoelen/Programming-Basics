package be.pxl.h5.exoef10;

import java.util.Scanner;

public class H5ExOef10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een jaartal in");
		int jaartal = keyboard.nextInt();
		
		if ((jaartal % 400 == 0) || (jaartal % 4 == 0) && (jaartal % 100 != 0)) {
			System.out.println(jaartal + " is een schrikkeljaar");
		} else {
			System.out.println(jaartal + " is geen schrikkeljaar");
		}
		
		keyboard.close();
	}
}