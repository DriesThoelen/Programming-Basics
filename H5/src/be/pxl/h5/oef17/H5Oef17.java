package be.pxl.h5.oef17;

public class H5Oef17 {

	public static void main(String[] args) {

		for (int getalRij = 1; getalRij <= 5; ++getalRij) {
			for (int getalKolom = 1; getalKolom <= 10; getalKolom++) {
				System.out.print(getalRij * getalKolom + "\t");
			}
			System.out.println("");
		}

	}
}