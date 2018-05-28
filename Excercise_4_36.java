// Excercise 4.37: Sides of a Right Triangle
import java.util.Scanner;

public class Excercise_4_36 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter three triangle side: ");
		int a = input.nextInt();
		System.out.print("Please enter the second triangle side: ");
		int b = input.nextInt();
		System.out.print("Please enter the third triangle side: ");
		int c = input.nextInt();

		int largest = 0;
		int secondLargest = 0;
		int thirdLargest = 0;

		if (largest < a) {
			largest = a;
		}
		if (largest < b) {
			largest = b;
		}
		if (largest < c) {
			largest = c;
		}
		System.out.printf("%d%n", largest);
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
				secondLargest = b;
				thirdLargest = a;
			}
		}
		System.out.printf("%d%n", secondLargest);
		System.out.printf("%d%n", thirdLargest);

		if (secondLargest*secondLargest + thirdLargest*thirdLargest == largest*largest){
			System.out.println("This could be the sides of a right triangle.");
		}
		else {
			System.out.println("This aren't the sides of a right triangle.");
		}
	}
}