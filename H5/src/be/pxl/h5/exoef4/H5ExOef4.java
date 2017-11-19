package be.pxl.h5.exoef4;

import java.util.Scanner;

public class H5ExOef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een getal a in");
		int aInput = keyboard.nextInt();
		
		System.out.println("Geef een getal b in");
		int bInput = keyboard.nextInt();		

		System.out.println("Geef een getal c in");
		int cInput = keyboard.nextInt();
		
		int b = aInput;
		int c = bInput;
		int a = cInput;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		keyboard.close();
	}
}