import java.util.Scanner;
public class Lab00Color {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your favourite colour? ");
		String color = input.next();
		for (int i = 0; i < color.length(); i++) {
			System.out.print("#");
		}
		System.out.println("\n" + color.toLowerCase());
		for (int i = 0; i < color.length(); i++) {
			System.out.print("#");
		}
		System.out.println();
	}
}