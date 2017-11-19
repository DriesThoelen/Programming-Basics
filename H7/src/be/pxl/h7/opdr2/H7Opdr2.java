package be.pxl.h7.opdr2;

import java.util.Scanner;

public class H7Opdr2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef een regel tekst in");
		String tekst = keyboard.nextLine();
		
		String[] tekstGesplitst = tekst.split(" ");
		
		for(String tekstDeel : tekstGesplitst) {
			System.out.println(tekstDeel);
		}

		keyboard.close();
	}
}