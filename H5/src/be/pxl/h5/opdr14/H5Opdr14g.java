package be.pxl.h5.opdr14;

public class H5Opdr14g {

	public static void main(String[] args) {
//		for(int getal = 0; getal < 10000; getal++) {
//			if ((getal % 6 == 0) && (getal % 28 == 0)) {
//				System.out.println(getal);
//			}
//		}
		
		for (int getal = 0; getal < 10000; getal += 28) {
			if (getal % 6 == 0) {
				System.out.println(getal);
			}
		}
	}
}