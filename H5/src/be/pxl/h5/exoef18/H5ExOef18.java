package be.pxl.h5.exoef18;

public class H5ExOef18 {

	public static void main(String[] args) {

		int startgetal = 1;
		int result = 0;
		int resultminus1 = 0;
		int resultminus2 = 0;
		
		result = startgetal;

		while (result < 1500) {
			System.out.print(result + " ");
			resultminus1 = result;
			result = resultminus1 + resultminus2;
			System.out.print(result + " ");
			resultminus2 = result;
			result = resultminus1 + resultminus2;
		}

	}
}
