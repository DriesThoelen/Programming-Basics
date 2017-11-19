package be.pxl.h5.exoef7;

import java.util.Scanner;

public class H5ExOef7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de verkoopprijs (incl. BTW) in");
		double verkoopprijsInclBTW = keyboard.nextDouble();
		
//		System.out.println("Geef de BTW code in");
//		int btwCode = keyboard.nextInt();
		
		System.out.println("Geef het artikelnummer in (bestaande uit 4 cijfers)");
		int artikelnummer = keyboard.nextInt();
//		int artikelnummerEersteCijfer = (int)((double)artikelnummer / 1000);
		int artikelnummerLaatsteCijfer = (int)((double)artikelnummer % 10);;
		
		double verkoopprijsExclBTW;
		double bedragBTW;
		double btwPercentage;
		
//		switch (btwCode) {
//		case 1:
//			bedragBTW = verkoopprijsInclBTW * 0.06;
//			btwPercentage = 0.06 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//			break;
//		case 2:
//			bedragBTW = verkoopprijsInclBTW * 0.17;
//			btwPercentage = 0.17 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//			break;
//		case 3:
//			bedragBTW = verkoopprijsInclBTW * 0.19;
//			btwPercentage = 0.19 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//			break;
//		case 4:
//			bedragBTW = verkoopprijsInclBTW * 0.25;
//			btwPercentage = 0.25 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//			break;
//		case 5:
//			bedragBTW = verkoopprijsInclBTW * 0.33;
//			btwPercentage = 0.33 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//			break;
//		default:
//			bedragBTW = verkoopprijsInclBTW * 0.21;
//			btwPercentage = 0.21 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//		}
		
//		switch (artikelnummerEersteCijfer) {
//		case 1:
//			bedragBTW = verkoopprijsInclBTW * 0.06;
//			btwPercentage = 0.06 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//			break;
//		case 2:
//			bedragBTW = verkoopprijsInclBTW * 0.17;
//			btwPercentage = 0.17 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//			break;
//		case 3:
//			bedragBTW = verkoopprijsInclBTW * 0.19;
//			btwPercentage = 0.19 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//			break;
//		case 4:
//			bedragBTW = verkoopprijsInclBTW * 0.25;
//			btwPercentage = 0.25 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//			break;
//		case 5:
//			bedragBTW = verkoopprijsInclBTW * 0.33;
//			btwPercentage = 0.33 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//			break;
//		default:
//			bedragBTW = verkoopprijsInclBTW * 0.21;
//			btwPercentage = 0.21 * 100;
//			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
//		}
		
		switch (artikelnummerLaatsteCijfer) {
		case 1:
			bedragBTW = verkoopprijsInclBTW * 0.06;
			btwPercentage = 0.06 * 100;
			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
			break;
		case 2:
			bedragBTW = verkoopprijsInclBTW * 0.17;
			btwPercentage = 0.17 * 100;
			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
			break;
		case 3:
			bedragBTW = verkoopprijsInclBTW * 0.19;
			btwPercentage = 0.19 * 100;
			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
			break;
		case 4:
			bedragBTW = verkoopprijsInclBTW * 0.25;
			btwPercentage = 0.25 * 100;
			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
			break;
		case 5:
			bedragBTW = verkoopprijsInclBTW * 0.33;
			btwPercentage = 0.33 * 100;
			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
			break;
		default:
			bedragBTW = verkoopprijsInclBTW * 0.21;
			btwPercentage = 0.21 * 100;
			verkoopprijsExclBTW = verkoopprijsInclBTW - bedragBTW;
		}
		
		System.out.println("Artikelnummer : " + artikelnummer);
		System.out.println("BTWpercentage : " + (int)btwPercentage + " %");
		System.out.println("Verkoopprijs (excl. BTW) : " + " € " + verkoopprijsExclBTW);
		System.out.println("BTWbedrag : " + "€ " + bedragBTW);
		
		keyboard.close();
	}
}