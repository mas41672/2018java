// Feat: Largest and Smallest Integers
//	Largest and smallest of five integer
//  -- solution with rudimentary if statements 
import java.util.Scanner;

public class Excercise_2_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first integer: ");
		int integer1 = input.nextInt();

		System.out.println("Enter second integer: ");
		int integer2 = input.nextInt();

		System.out.println("Enter third integer: ");
		int integer3 = input.nextInt();

		System.out.println("Enter fourth integer: ");
		int integer4 = input.nextInt();

		System.out.println("Enter fifth integer: ");
		int integer5 = input.nextInt();

		int smallest;

		smallest = integer1;
		if (integer2 < smallest) {
			smallest = integer2;
		}
		if (integer3 < smallest) {
		 	smallest = integer3;
		}
		if (integer4 < smallest) {
			smallest = integer4;
		}
		if (integer5 < smallest) {
			smallest = integer5;
		}

		System.out.printf("The smallest value of the five numbers is: %d%n", smallest);

		int largest = integer1;

		if (largest < integer2) {
			largest = integer2;
		}
		if (largest < integer3) {
			largest = integer3; 
		}
		if (largest < integer4) {
			largest = integer4;
		}
		if (largest < integer5) {
			largest = integer5;
		}
		
		System.out.printf("The largest value of the five numbers is: %d%n", largest);
	}
}