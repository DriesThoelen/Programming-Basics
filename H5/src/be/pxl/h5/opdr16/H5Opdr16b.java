package be.pxl.h5.opdr16;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class H5Opdr16b {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		System.out.println("Geef het belastbaar bedrag in");
		double belastbaarBedrag = keyboard.nextDouble();
		
		double verschuldigdeBelasting = berekenBelasting(belastbaarBedrag);
		
		System.out.println("Verschuldigde belasting : " + "€ " + df.format(verschuldigdeBelasting));
		
		keyboard.close();
	}
	
	public static double berekenBelasting(double belastbaarBedrag) {
		double verschuldigdeBelasting = 0;
		
		if (belastbaarBedrag <= 25000) {
			verschuldigdeBelasting = belastbaarBedrag * 0.384;
		} else {
			if (belastbaarBedrag <= 55000) {
				verschuldigdeBelasting = (belastbaarBedrag - 25000) * 0.50 + 25000 * 0.384;
			} else {
				verschuldigdeBelasting = (belastbaarBedrag - 55000) * 0.60 + 30000 * 0.5 + 25000 * 0.384;
			}
		}
		
		return verschuldigdeBelasting;
	}
}