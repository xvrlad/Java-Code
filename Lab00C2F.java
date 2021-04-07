import java.util.Scanner;
public class Lab00C2F {
	public static void main(String[] args) {
	    Scanner input =  new Scanner(System.in);
		System.out.println("Enter a temperature in degrees Celsius: ");
		double inCelsius = input.nextDouble();
		
		double inFahrenheit = 32 + inCelsius * (9.0 / 5);
		System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit\n", inCelsius, inFahrenheit);
	}
}