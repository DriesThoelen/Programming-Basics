package be.pxl.testexamen.opgave6;

public class TestExamenOpgave6 {

	public static void main(String[] args) {
		int getal1 = 0;
		int getal2 = 0;
		double getal3 = 2.5;
		System.out.println("Waarde is " + berekenWaarde(5, 8));
		System.out.println("Waarde is " + berekenWaarde(10, 20.5));
		System.out.println(getal1);
		System.out.println(getal2);
		System.out.println(getal3);
	}
	
	public static int berekenWaarde (int a, int b) {
		@SuppressWarnings("unused")
		int getal1 = 7;
		return a + b;
	}
	
	public static double berekenWaarde (double a, double b) {
		@SuppressWarnings("unused")
		double getal3 = 10.5;
		return a * b;
	}
	
	public static long berekenWaarde (long a, int b) {
		@SuppressWarnings("unused")
		int getal2 = 9;
		return a - b;
	}
}