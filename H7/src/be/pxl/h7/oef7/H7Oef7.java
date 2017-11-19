package be.pxl.h7.oef7;

public class H7Oef7 {

	public static void main(String[] args) {
		int[][] voorraadGegevensTshirts = { { 45, 102, 19, 55, 0 }, { 79, 47, 58, 22, 46 }, { 109, 33, 112, 0, 0 } };
		int[][] bijTeBestellenTshirtsAantal = new int[3][5];
		int[] bijTeBestellenTshirtsMaat = new int[4];
		int[] bijTeBestellenTshirtsKleur = new int[6]; 
		int[] aantalTshirtsMaat = new int[3];
		String[] kleuren = { "rood", "wit", "blauw", "oranje", "zwart", null };
		String[] maten = { "small", "medium", "large", null };

		for (int maat = 0; maat < voorraadGegevensTshirts.length; maat++) {
			for (int kleur = 0; kleur < voorraadGegevensTshirts[maat].length; kleur++) {
				aantalTshirtsMaat[maat] += voorraadGegevensTshirts[maat][kleur];
			}
			for (int kleur = 0; kleur < voorraadGegevensTshirts[maat].length; kleur++) {
				if (voorraadGegevensTshirts[maat][kleur] < (aantalTshirtsMaat[maat] / 3)) {
					bijTeBestellenTshirtsAantal[maat][kleur] = (aantalTshirtsMaat[maat] / 3) - voorraadGegevensTshirts[maat][kleur];
					bijTeBestellenTshirtsMaat[maat] = maat;
					bijTeBestellenTshirtsKleur[kleur] = kleur;
				} else {
					bijTeBestellenTshirtsMaat[maat] = 3;
					bijTeBestellenTshirtsKleur[kleur] = 5;
				}
				if ((bijTeBestellenTshirtsMaat[maat] != 3) && (bijTeBestellenTshirtsKleur[kleur] != 5)) {
					System.out.printf("Bij te bestellen T-shirten : %d %s %s %n", bijTeBestellenTshirtsAantal[maat][kleur], maten[bijTeBestellenTshirtsMaat[maat]], kleuren[bijTeBestellenTshirtsKleur[kleur]]);
				}
			}
			System.out.println("Aantal T-shirten maat " + maten[maat] + " = " + aantalTshirtsMaat[maat]);
		}
		
	}
}