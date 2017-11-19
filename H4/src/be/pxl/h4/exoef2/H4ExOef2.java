package be.pxl.h4.exoef2;

import java.util.Scanner;

public class H4ExOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("a is");
		int a = keyboard.nextInt();

		System.out.println("b is");
		int b = keyboard.nextInt();

		System.out.println("c is");
		int c = keyboard.nextInt();

		if (a + b < 20) {
			int sum = a + b + c;
			System.out.println(sum);
		} else {
			System.out.println("te groot");
		}

		keyboard.close();
	}
}