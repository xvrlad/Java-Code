import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lab02 {
	public static void main(String[] args) {
		double[] array = new double[]{5.0, 39.5, 30.0, 26.5, 59.0, 60.0};
		convert_scores(array, 60);
		System.out.println(Arrays.toString(array));
	}
	
	//Q1
	public static int[] getLargerThan(int[] numbers, int m) {
		int howManyLarger = 0;
		for (int number : numbers) {
			if (number > m) {
				howManyLarger++;
			}
		}

		int[] largerThanM = new int[howManyLarger];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > m) {
				largerThanM[index] = numbers[i];
				index++;
			}
		}
		
		return largerThanM;
	}
	
	//Q2
	public static int get_sum_squares(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number * number;
		}
		return sum;
	}
	
	//Q3
	public static int[] getIncreasedDecreased(int[] numbers) {
		int[] newArray = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 100) {
				newArray[i] = numbers[i] * 10;
			} else {
				newArray[i] = numbers[i] / 10;
			}
		}
		return newArray;
	}
	
	//Q4
	public static void convert_scores(double[] numbers, int outOf) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Math.round((numbers[i] / outOf) * 1000) / 10.0;
		}
	}
	
	//Q5
	public static void rotate_numbers(int[] numbers){
		for (int i = numbers.length - 1; i - 1 > -1; i--) {
			int moveNumber = numbers[i], temp = numbers[i - 1];
			numbers[i-1] = moveNumber;
			numbers[i] = temp;
		}
	}
	
	//Q6
	public static int[][] generate2DArray(int numberOfRows, int numberOfColumns) {
		int[][] twoDArray = new int[numberOfRows][numberOfColumns];
		for (int row = 0; row < numberOfRows; row++) {
			for (int column = 0; column < numberOfColumns; column++) {
				twoDArray[row][column] = row * column;
			}
		}
		return twoDArray;
	}
	
	//Q7
	public static int[][] generateArray(int[] numbers) {
		int[][] raggedArray = new int[numbers.length][];
		for (int i = 0, j = 1; i < numbers.length; i++, j++) {
			raggedArray[i] = new int[j];
			for (int k = raggedArray[i].length - 1, numbersIndex = numbers.length - 1; k >= 0; k--, numbersIndex--) {
				raggedArray[i][k] = numbers[numbersIndex];
			}
		}
		return raggedArray;
	}

	//Q8
	public static int[] remove_element_at3(int[] values) {
		int[] newArray = new int[values.length - 1];
		for (int i = 0, j = 0; i < values.length; i++, j++) {
			if (i == 3) {
				j -= 1;
				continue;
			}
			newArray[j] = values[i];
		}
		return newArray;
	}

	//Q9
	public static boolean noEvens(int[] values) {
		for (int integer : values) {
			if (integer % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	//Q10
	public static ArrayList<Integer> getMultiple(int[] numbers, int m) {
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		for (int integers : numbers) {
			if (integers % m == 0) {
				newArray.add(integers);
			}
		}
		return newArray;
	}

	//Q11
	public static void removeNegatives(ArrayList<Integer> numbers) {
		for (int i = numbers.size() - 1; i >= 0; i--) {
			if (numbers.get(i) < 0) {
				numbers.remove(i);
			}
		}
	}
}