import java.util.Scanner;
public class LabTriangle{
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double height, base;
	System.out.println("Enter the height of a triangle: ");
	height = input.nextDouble();
	System.out.println("Enter the base of a triangle: ");
	base = input.nextDouble();
	
	System.out.printf("Area of a triangle is %.1f", (height * base) / 2);
   }
}