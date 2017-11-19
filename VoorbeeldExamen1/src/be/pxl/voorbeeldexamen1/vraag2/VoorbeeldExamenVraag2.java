package be.pxl.voorbeeldexamen1.vraag2;

import java.math.BigInteger;

public class VoorbeeldExamenVraag2 {

	public static void main(String[] args) {

		BigInteger plus = new BigInteger("1");

		BigInteger product = new BigInteger("1");
		
		for(BigInteger getal = new BigInteger("1"); getal.intValue() <= 100; getal = getal.add(plus)) {
			product = product.multiply(getal);
			System.out.println(product.longValue());
		}
		
		System.out.println("Uiteindelijk resultaat = " + product.longValue());
		
	}
}