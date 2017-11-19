package be.pxl.h5.oef21;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class H5Oef21 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		System.out.println("Geef de bruto jaarwedden in");
		double brutoJaarwedden = keyboard.nextDouble();
		
		double aantalBeoordelingen = 0;
		double aantalBeoordelingenSchitterend = 0;
		double percentageBeoordelingenSchitterend;
		
		while (brutoJaarwedden != 0) {
			System.out.println("Geef de beoordelingscode in (1 = slecht, 2 = voldoende, 3 = goed, 4 = schitterend)");
			int beoordelingsCode = keyboard.nextInt();
			
			double eindejaarspremie = berekenEindejaarspremie(brutoJaarwedden, beoordelingsCode);
			
			if (beoordelingsCode > 0 && beoordelingsCode < 5) {
				System.out.println("De eindejaarspremie bedraagt : " + "€ " + df.format(eindejaarspremie));
			}
			
			if (beoordelingsCode == 4) {
				aantalBeoordelingenSchitterend += 1;
			}
			
			aantalBeoordelingen += 1;
			
			System.out.println("Geef de bruto jaarwedden in");
			brutoJaarwedden = keyboard.nextDouble();
			
			System.out.println("Geef de beoordelingscode in (1 = slecht, 2 = voldoende, 3 = goed, 4 = schitterend)");
			beoordelingsCode = keyboard.nextInt();
		}
		
		percentageBeoordelingenSchitterend = aantalBeoordelingenSchitterend / aantalBeoordelingen * 100;
		System.out.println("Het percentage van werknemers die de beoordeling schitterend hebben gekregen : " + percentageBeoordelingenSchitterend + " %");
		
		keyboard.close();
	}

	public static double berekenEindejaarspremie(double brutoJaarwedden, int beoordelingsCode) {
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
		return eindejaarspremie;
	}
}