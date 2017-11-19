package be.pxl.h6.slide30;

import java.util.Scanner;

public class H6Slide30 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String text = keyboard.next();
		System.out.println(text);
		
		keyboard.next();
		
		text = keyboard.nextLine();
		System.out.println(text);
				
		keyboard.close();
	}
}