package be.pxl.h7.opdr3;

public class H7Opdr3a {

	public static void main(String[] args) {
		int[][] tabel = new int[4][6];
				
		for(int rijnummer = 0; rijnummer < tabel.length; rijnummer++) {
			for(int kolomnummer = 0; kolomnummer < tabel[rijnummer].length; kolomnummer++) {
				tabel[rijnummer][kolomnummer] = (rijnummer + 1) * (kolomnummer + 1);
			}
		}
		
		for(int[] tabelrijen : tabel) {
			for(int tabelgetallen : tabelrijen) {
				System.out.print(tabelgetallen + "\t");
			}
			System.out.println();
		}

	}
}