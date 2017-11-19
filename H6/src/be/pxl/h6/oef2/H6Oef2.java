package be.pxl.h6.oef2;

import java.util.Scanner;

public class H6Oef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een tekst in");
		String tekst = keyboard.nextLine();

		int tekstlengte = tekst.length();
		int index = tekst.toUpperCase().indexOf("T");
				
				
		if (index != -1) {
			if (tekstlengte % 2 == 0) {
				System.out.println(String.join("", tekst.substring(0, index), tekst.substring(index).toLowerCase()));
			} else {
				System.out.println(String.join("", tekst.substring(0, index), tekst.substring(index).toUpperCase()));
			}
		} else {
			System.out.println("De ingevoerde tekst bevat geen t of T");
		}
				
//		int index1 = tekst.indexOf('t');
//		int index2 = tekst.indexOf('T');
//
//		if ((index1 != -1) || (index2 != -1)) {
//			if (index1 > index2) {
//				if (tekstlengte % 2 == 0) {
//					System.out.println(String.join("", tekst.substring(0, index1), tekst.substring(index1).toLowerCase()));
//				} else {
//					System.out.println(String.join("", tekst.substring(0, index1), tekst.substring(index1).toUpperCase()));
//				}
//			} else {
//				if (tekstlengte % 2 == 0) {
//					System.out.println(String.join("", tekst.substring(0, index2), tekst.substring(index2).toLowerCase()));
//				} else {
//					System.out.println(String.join("", tekst.substring(0, index2), tekst.substring(index2).toUpperCase()));
//				}
//			}
//		} else {
//			System.out.println("De ingevoerde tekst bevat geen t of T");
//		}

		keyboard.close();
	}
}