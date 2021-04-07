import java.util.Scanner;
public class Lab00Q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of cents: ");
		String dollars = input.next();
		
		if (dollars.length() < 3) {
			System.out.printf("That is 0 dollars and %s cents.\n", dollars);
		} else if (dollars.charAt(0) == '1') {
			System.out.printf("That is 1 dollar and %s cents.\n", dollars.substring(1));
		} else {
			System.out.printf("That is %s dollars and %s cents.\n", dollars.substring(0, 1), dollars.substring(1));
		}
	}
}