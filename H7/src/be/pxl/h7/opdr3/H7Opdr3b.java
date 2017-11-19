package be.pxl.h7.opdr3;

public class H7Opdr3b {

	public static void main(String[] args) {
		int x = 0;
		int a[][];
		a = new int[5][];
		// kolommen creëren
		for(int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
		}
		// tabel vullen
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				a[i][j] = x++;
			}
		}
		// tabel drukken
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("a(%d,%d) = %d \t", i, j, a[i][j]);
			}
			System.out.println();
		}
	}
}