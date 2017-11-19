package be.pxl.h5.oef9;

import java.util.Scanner;

public class H5Oef9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een getal a in");
		int a = keyboard.nextInt();

		System.out.println("Geef een getal b in");
		int b = keyboard.nextInt();

		System.out.println(
				"Geef een bewerkingscode c in (1 = optelling, 2 = aftrekking, 3 = vermenigvuldiging, 4 = kwadraat a, 5 = kwadraat b");
		int c = keyboard.nextInt();

		int output;

		switch (c) {
		case 1:
			output = a + b;
			System.out.println(a + " + " + b + " = " + output);
			break;
		case 2:
			output = a - b;
			System.out.println(a + " - " + b + " = " + output);
			break;
		case 3:
			output = a * b;
			System.out.println(a + " * " + b + " = " + output);
			break;
		case 4:
			output = a * a;
			System.out.println(a + " * " + a + " = " + output);
			break;
		case 5:
			output = b * b;
			System.out.println(b + " * " + b + " = " + output);
			break;
		default:
			System.out.println("Foutieve code");
		}
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		keyboard.close();
	}
}