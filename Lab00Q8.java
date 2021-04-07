import java.util.Scanner;
import java.lang.Math;

public class Lab00Q8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radians: ");
		int radiansInput = input.nextInt();
		
		double degrees = radiansInput * 57.2958;
		System.out.printf("%d radians is approximately equal to %.0f degrees.\n", radiansInput, degrees);
	}
}