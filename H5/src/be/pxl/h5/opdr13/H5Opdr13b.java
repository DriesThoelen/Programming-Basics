package be.pxl.h5.opdr13;

import java.util.Scanner;

public class H5Opdr13b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getal;
		
		do { 
			System.out.println("Geef een getal in tussen 0 en 10 : ");
			getal  = keyboard.nextInt();
		} while ((getal >= 10) || (getal < 0));
		
		keyboard.close();
	}
}