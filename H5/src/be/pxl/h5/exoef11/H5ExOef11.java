package be.pxl.h5.exoef11;

public class H5ExOef11 {

	public static void main(String[] args) {
		System.out.printf("%1s%22s", "Graden Celsius", "Graden Fahrenheit");
		for(double gradenCelsius = -40; gradenCelsius < 101; gradenCelsius = gradenCelsius + 10) {
			double gradenFahrenheit = ((double) 9 / 5) * gradenCelsius + 32;
			System.out.println("");
			System.out.printf("%8s%20s", (int)gradenCelsius, (int)gradenFahrenheit);
		}

	}
}