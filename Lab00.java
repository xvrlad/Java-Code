import java.util.Scanner;
import java.lang.Math;

public class Lab00 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  //Q1
	  // int num1, num2, num3;
	  // System.out.print("Enter the first integer: \n");
	  // num1 = input.nextInt();
	  // System.out.print("Enter the second integer: \n");
	  // num2 = input.nextInt();
	  // System.out.print("Enter the third integer: \n");
	  // num3 = input.nextInt();
	  
	  // System.out.printf("%5d%5d%5d\n", num1, num1 * num1, num1 * num1 * num1);
	  // System.out.printf("%5d%5d%5d\n", num2, num2 * num2, num2 * num2 * num2);
	  // System.out.printf("%5d%5d%5d\n", num3, num3 * num3, num3 * num3 * num3);
	  
	  //Q?
	  // System.out.println("Enter an integer: ");
	  // int number = input.nextInt();
	  // double squareRoot = Math.sqrt(number);
	  // System.out.printf("Square root of " + number + " = %.2f", squareRoot);
	  
	  //Q11
	  System.out.println("Enter principle: ");
	  double principle = input.nextDouble();
	  System.out.println("Enter time (number of years): ");
	  int time = input.nextInt();
	  System.out.println("Enter rate: ");
	  double rate = input.nextDouble();

	  System.out.printf("Compound Interest = %.2f\n", principle * Math.pow((1 + (rate / 100)), time));
  }
}