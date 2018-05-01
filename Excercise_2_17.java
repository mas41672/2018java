// Feat: input three integers for arithmetic 
// 
// -- sum, average, product, smallest, 
import java.util.Scanner;

public class Excercise_2_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int integer1 = input.nextInt();

		System.out.print("Enter second integer: ");
		int integer2 = input.nextInt();

		System.out.print("Enter third integer: ");
		int integer3 = input.nextInt();

		int sum = integer1 + integer2 + integer3;
		System.out.printf("The sum is %d%n", sum);

		int product = integer1 * integer2 * integer3;
		System.out.printf("The product is %d%n", product);

		int average = sum / 3;
		System.out.printf("The average is %d%n", average);

		int smallest;
		smallest = integer1;
		if (integer2 < smallest) {
			smallest = integer2;
			if (integer3 < smallest) {
				smallest = integer3;
			}
		}
		if (integer3 < smallest) {
			smallest = integer3;
			if (integer2 < smallest) {
				smallest = integer2;
			}
		}
		System.out.printf("The smallest is %d%n", smallest);

		int largest;
		largest =  integer1;
		if (integer2 > largest) {
			largest = integer2;
			if (integer3 > largest){
				largest = integer3;
			}
		}
		if (integer3 > largest) {
			largest = integer3;
			if (integer2 > largest) {
				largest = integer2;
			}
		}
		System.out.printf("The largest number is %d%n", largest);
	}
}