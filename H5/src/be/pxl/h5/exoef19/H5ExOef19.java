package be.pxl.h5.exoef19;

public class H5ExOef19 {

	public static void main(String[] args) {
		
		int exponent = 2;
		int count;
		long getal = 1L;
		long getalNaBewerking = 1;
		long result = 0;
		
		for(int basisgetal = 1; basisgetal < 24; basisgetal += 2) {
			getal = basisgetal;
			
			for(count = 0; count < exponent; count++) {
				getalNaBewerking *= getal;
			}
			
//			result = (long)(Math.pow(basisgetal, exponent));
			
			if (exponent < 13) {
				System.out.print(basisgetal + "E" + exponent + " (= " + getalNaBewerking +  ") + ");	
			} else {
				System.out.print(basisgetal + "E" + exponent + " (= " + getalNaBewerking +  ") ");
			}
			
			result += getalNaBewerking;
			getalNaBewerking = 1;
			count = 0;
			exponent++;
		}
		
		System.out.println("=" + " " + result);
		if (result != 511510734979778860L) {
			System.out.println("Something went wrong");
		} else {
			System.out.println(result);
		}
	}
}