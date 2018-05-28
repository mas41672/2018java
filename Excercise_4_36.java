// Excercise 4.36: Sides of a Triangel
import java.util.Scanner;

public class Excercise_4_36 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter three triangle side: ");
		double a = input.nextDouble();
		System.out.print("Please enter the second triangle side: ");
		double b = input.nextDouble();
		System.out.print("Please enter the third triangle side: ");
		double c = input.nextDouble();

		double largest = 0.0;
		double secondLargest = 0.0;
		double thirdLargest = 0.0;

		if (largest < a) {
			largest = a;
		}
		if (largest < b) {
			largest = b;
		}
		if (largest < c) {
			largest = c;
		}

		if (largest == a) {
			if ( c <= b) {
				secondLargest = b;
				thirdLargest = c;
			}
			else {
				secondLargest = c;
				thirdLargest = b;
			}
		}

		if (largest == b) {
			if ( c < a) {
				secondLargest = a;
				thirdLargest = c;
			}
			else {
				secondLargest = c;
				thirdLargest = a;
			}
		}

		if (largest == c) {
			if (b < a){
				largest = a;
				secondLargest = b;
			}
			else {
				largest = b;
				secondLargest = a;
			}
		}

		if (secondLargest + thirdLargest > largest){
			System.out.println("This could be the sides of a triangle.");
		}
		else {
			System.out.println("This aren't the sides of a triangle.");
		}
	}
}