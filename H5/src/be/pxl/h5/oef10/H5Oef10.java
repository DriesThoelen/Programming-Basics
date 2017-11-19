package be.pxl.h5.oef10;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class H5Oef10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		System.out.println("Geef jouw bruto jaarwedden in");
		double brutoJaarwedden = keyboard.nextDouble();
		
		System.out.println("Geef de beoordelingscode in (1 = slecht, 2 = voldoende, 3 = goed, 4 = schitterend)");
		int beoordelingsCode = keyboard.nextInt();
		
		double vastGedeelte = brutoJaarwedden / 20;
		double eindejaarspremie = 0;
		
		switch (beoordelingsCode) {
		case 1:
			eindejaarspremie = vastGedeelte * 0.0;
			break;
		case 2:
			eindejaarspremie = vastGedeelte * 0.18;
			break;
		case 3:
			eindejaarspremie = vastGedeelte * 0.25;
			break;
		case 4:
			eindejaarspremie = vastGedeelte * 0.33;
			break;
		default:
			System.out.println("Foutieve beoordelingscode");
		}
		
		if (beoordelingsCode > 0 && beoordelingsCode < 5) {
			System.out.println("Jouw eindejaarspremie bedraagt : " + "€ " + df.format(eindejaarspremie));
		}
		
		keyboard.close();
	}
}