package be.pxl.h5.opdr15;

public class H5Opdr15a {

	public static void main(String[] args) {
		int g = 1;
		int i = 2;
		
		// for (int i = 2; i < 8; i +=3) {
		// System.out.println(g);
		// }

		// while (i < 8) {
		// System.out.println(g);
		// i +=3;
		// }

		do {
			System.out.println(g);
			i += 3;
		} while (i < 8);
	}
}