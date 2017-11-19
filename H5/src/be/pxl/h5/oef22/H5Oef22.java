package be.pxl.h5.oef22;

//import java.math.RoundingMode;
//import java.text.DecimalFormat;
import java.util.Scanner;

public class H5Oef22 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
//		DecimalFormat df = new DecimalFormat("#.##");
//		DecimalFormat gf = new DecimalFormat("#");

//		df.setRoundingMode(RoundingMode.HALF_UP);
//		gf.setRoundingMode(RoundingMode.CEILING);

		System.out.println("Geef de lengte van het te verven plafond in");
		double lengte = keyboard.nextDouble();

		System.out.println("Geef de breedte van het te verven plafond in");
		double breedte = keyboard.nextDouble();

		double literVerf = berekenLiterVerf(lengte, breedte);

//		System.out.println("Er is " + df.format(literVerf) + " liter verf nodig om het plafond te schilderen");
		System.out.println("Er is " + literVerf + " liter verf nodig om het plafond te schilderen");

		System.out.println("Geef de inhoud in liter van de potten verf");
		double inhoudPottenVerf = keyboard.nextDouble();

//		double aantalPottenVerf = berekenAantalPottenVerf(inhoudPottenVerf, literVerf);
		int geheelAantalPotten = berekenAantalPottenVerf(inhoudPottenVerf, literVerf);

//		if (aantalPottenVerf == 1) {
		if (geheelAantalPotten == 1) {
//			System.out.println("Er is " + gf.format(aantalPottenVerf) + " pot verf nodig om het plafond te schilderen");
			System.out.println("Er is " + geheelAantalPotten + " pot verf nodig om het plafond te schilderen");
		} else {
//			System.out.println("Er zijn " + gf.format(aantalPottenVerf) + " potten verf nodig om het plafond te schilderen");
			System.out.println("Er zijn " + geheelAantalPotten + " potten verf nodig om het plafond te schilderen");
		}

		keyboard.close();
	}

	public static double berekenLiterVerf(double lengte, double breedte) {
		double literVerf = 0;
		double oppervlaktePlafond;

		oppervlaktePlafond = lengte * breedte;
		literVerf = oppervlaktePlafond / 7;

		return literVerf;
	}

//	public static double berekenAantalPottenVerf(double inhoudPottenVerf, double literVerf) {
	public static int berekenAantalPottenVerf(double inhoudPottenVerf, double literVerf) {
		double aantalPottenVerf = 0;

		aantalPottenVerf = literVerf / inhoudPottenVerf;
		int geheelAantalPotten = (int) aantalPottenVerf;
		if (geheelAantalPotten != aantalPottenVerf) {
			geheelAantalPotten++;
		}

//		return aantalPottenVerf;
		return geheelAantalPotten;
	}
}