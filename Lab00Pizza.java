import java.util.Scanner;
public class Lab00Pizza {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many people in the group? ");
		int numberOfPeople = input.nextInt();
		System.out.println("How much was the Pizzas in total? ");
		double price = input.nextDouble();

		System.out.printf("Each person pays $%.0f.\n", price / numberOfPeople);
	}
}