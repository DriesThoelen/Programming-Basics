package be.pxl.h6.oef9;

import java.awt.Rectangle;
import java.util.Random;

public class H6Oef9 {

	public static void main(String[] args) {
		Random rand = new Random();
		StringBuilder rechthoekBuilder = new StringBuilder();

		Rectangle rechthoek100op100 = new Rectangle(0, 0, 100, 100);
		String geplaatst = "";

		double xGrootsteRechthoek = 0;
		double yGrootsteRechthoek = 0;
		double breedteGrootsteRechthoek = 1;
		double hoogteGrootsteRechthoek = 1;

		System.out.println("Gemaakte rechthoeken:");
		System.out.println("\t" + "x" + "\t \t" + "y" + "\t \t" + "breedte" + "\t \t" + "hoogte");

		for (int count = 1; count <= 20; count++) {
			Rectangle rechthoek = new Rectangle(rand.nextInt(100), rand.nextInt(100), (rand.nextInt(70) + 1), (rand.nextInt(70) + 1));
			double xRechthoek = rechthoek.getX();
			double yRechthoek = rechthoek.getY();
			double breedteRechthoek = rechthoek.getWidth();
			double hoogteRechthoek = rechthoek.getHeight();
			if (rechthoek100op100.contains(rechthoek) == true) {
				geplaatst = "geplaatst";
			}
			System.out.println("\t" + (int) xRechthoek + "\t \t" + (int) yRechthoek + "\t \t" + (int) breedteRechthoek + "\t \t" + (int) hoogteRechthoek + "\t" + geplaatst);
			
			rechthoekBuilder.append("Rechthoek ");
			rechthoekBuilder.append(count);
			rechthoekBuilder.append(" is toegevoegd");
			rechthoekBuilder.append("\n");

			double oppervlakteRechthoek = hoogteRechthoek * breedteRechthoek;
			double oppervlakteGrootsteRechthoek = hoogteGrootsteRechthoek * breedteGrootsteRechthoek;
			if (oppervlakteRechthoek > oppervlakteGrootsteRechthoek) {
				xGrootsteRechthoek = xRechthoek;
				yGrootsteRechthoek = yRechthoek;
				breedteGrootsteRechthoek = breedteRechthoek;
				hoogteGrootsteRechthoek = hoogteRechthoek;
			}
		}
		
		System.out.println();
		System.out.println(rechthoekBuilder);
		System.out.println("de grootste geplaatste rechthoek : " + " xy = " + (int) xGrootsteRechthoek + "-" + (int) yGrootsteRechthoek + " , " + " breedte = " + (int) breedteGrootsteRechthoek + " hoogte = " + (int) hoogteGrootsteRechthoek);
	}
}