package be.pxl.h5.opdr4;

import java.util.Scanner;

public class H5Opdr4g {

	public static void main(String[] args) {
		int number1 = 6;
		int number2 = 3;
		int sum;
		int difference;
		int multiplication;
		int division;
		int divisionremainder;
		// char letter = 'a';
		// vervolg
		// int sumchar;
		// char sumchar;
		// uitbreiding
		// byte honderdtal;
		// short tienduizendtal;
		// int miljardtal;
		// long triljoental;
		// float kommaMiljardtal;
		// double kommaTriljoental;

		sum = number1 + number2;
		difference = number1 - number2;
		multiplication = number1 * number2;
		division = number1 / number2;
		divisionremainder = number1 % number2;
		// vervolg
		// sumchar = ++letter;
		// uitbreiding
		Scanner keyboard = new Scanner(System.in);
		// System.out.println("Geef een geheel getal in tussen -127 en 127");
		// honderdtal = keyboard.nextByte();
		// System.out.println("Geef een geheel getal in tussen -32767 en 32767");
		// tienduizendtal = keyboard.nextShort();
		// System.out.println("Geef een geheel getal in tussen -2147483647 en
		// 2147483647");
		// miljardtal = keyboard.nextInt();
		// System.out.println("Geef een geheel getal in tussen -9223372036854775807L en
		// 9223372036854775807L");
		// triljoental = keyboard.nextLong();
		// System.out.println("Geef een kommagetal in tussen -2147483647,9999999999F en
		// 2147483647,9999999999F");
		// kommaMiljardtal = keyboard.nextFloat();
		// System.out.println("Geef een kommagetal in tussen
		// -9223372036854775807,999999999999999999999 en
		// 9223372036854775807,999999999999999999999");
		// kommaTriljoental = keyboard.nextDouble();

		System.out.println(sum);
		System.out.println(difference);
		System.out.println(multiplication);
		System.out.println(division);
		System.out.println(divisionremainder);
		// vervolg
		// System.out.println("vervolg");
		// System.out.println(sumchar);
		// uitbreiding
		// System.out.println("uitbreiding");
		// System.out.println(honderdtal);
		// System.out.println(tienduizendtal);
		// System.out.println(miljardtal);
		// System.out.println(triljoental);
		// System.out.println(kommaMiljardtal);
		// System.out.println(kommaTriljoental);
		keyboard.close();
	}
}