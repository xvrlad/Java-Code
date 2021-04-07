//Q?
// import java.util.Scanner;
// import java.lang.Character;
// public class Lab01 {
	// public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// System.out.println("Enter a sentence: ");
		// String sentence = input.nextLine();
		
		// int numberOfLetters = 0, numberOfDigits = 0;
		
		// for (int i = 0; i < sentence.length(); i++) {
			// if (Character.isLetter(sentence.charAt(i)))
				// numberOfLetters++;
			// else if (Character.isDigit(sentence.charAt(i)))
				// numberOfDigits++;	
		// }
		// System.out.printf("The number of letters is %d and the number of digits is %d.\n", numberOfLetters, numberOfDigits);
	// }
// }

//Q5
// import java.util.Scanner;
// public class Lab01 {
   // public static void main(String[] args) {
      // Scanner input = new Scanner(System.in);
	  // System.out.println("Enter side1 of a triangle: ");
	  // double side1 = input.nextDouble();
	  // System.out.println("Enter side2 of a triangle: ");
	  // double side2 = input.nextDouble();
	  // System.out.println("Enter side3 of a triangle: ");
	  // double side3 = input.nextDouble();
	  
	  // if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2) {
		  // System.out.println("Valid Triangle!");
	  // } else {
		  // System.out.println("Invalid Triangle!");
	  // }
   // }
// }

//Q6
// import java.util.Scanner;
// public class Lab01 {
	// public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// System.out.println("Enter the start number: ");
		// int start = input.nextInt();
		// System.out.println("Enter the end number: ");
		// int end = input.nextInt();
		
		// System.out.print("Values: ");
		// for (; start <= end; start++){
			// System.out.print(start + " ");
		// }
		// System.out.println();
	// }
// }

//Q7 - add 1 to sqrt, then floor is result (update - not necessary for floor, just cut off double with casting)
// import java.util.Scanner;
// import java.lang.Math;
// public class Lab01 {
   // public static void main(String[] args) {
      // Scanner input = new Scanner(System.in);
	  // int integer = input.nextInt();
	  // int result = (int) (Math.sqrt(integer) + 1);
	  // System.out.printf("The smallest n such that n^2 > %d is %d.", integer, result);
   // }
// }

//Q8
import java.util.Scanner;
import java.lang.Math;

public class Lab01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number1: ");
		int number1 = input.nextInt();
		System.out.println("Enter a number2: ");
		int number2 = input.nextInt();
		System.out.println("Enter a number3: ");
		int number3 = input.nextInt();
		
		if (number1 <= 0 || number2 <= 0 || number3 <= 0) {
			System.out.println("The greatest common divisor is: -1");
		} else {
		int multiple = 0, remainder = -1, gcd = Math.min(number1, number2);
		
		while (remainder != 0) {
			multiple = Math.max(number1, number2) / Math.min(number1, number2);
			remainder = Math.max(number1, number2) % Math.min(number1, number2);
			number1 = Math.min(number1, number2);
			number2 = remainder;
			if (remainder == 0)
				break;
			gcd = remainder;
		}
		
		number1 = gcd;
		remainder = -1;

		while (remainder != 0) {
			multiple = Math.max(number1, number3) / Math.min(number1, number3);
			remainder = Math.max(number1, number3) % Math.min(number1, number3);
			number1 = Math.min(number1, number3);
			number3 = remainder;
			if (remainder == 0)
				break;
			gcd = remainder;
		}
		
		System.out.printf("The greatest common divisor is: %d\n", gcd);
		}
	}
}