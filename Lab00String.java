//Q3
// import java.util.Scanner;
// import java.lang.Character;
// public class Lab00String {
	// public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// System.out.println("Enter a sentence: ");
		// String sentence = input.nextLine();
		
		// String finalString = "";
		
		// for (int i = 0; i < sentence.length(); i++) {
			// char letter = sentence.charAt(i);
			// if (Character.isUpperCase(letter))
				// finalString += Character.toLowerCase(letter);
			// else if (Character.isLowerCase(letter))
				// finalString += Character.toUpperCase(letter);
			// else
				// finalString += letter;
		// }
		// System.out.println(finalString);
	// }
// }

import java.util.Scanner;
import java.util.regex.*;
public class Lab00String {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an IP address: ");
		String ip = input.next();
		String[] ipNumbers = ip.split("\\.", 4);
		System.out.printf("Network ID: %s, %s and %s\n", ipNumbers[0], ipNumbers[1], ipNumbers[2]);
		System.out.printf("Host ID: %s\n", ipNumbers[3]);
	}
}