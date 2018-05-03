// Excercise 2.28
// Diameter, Circumference and Area of a Circle
import java.util.Scanner;

public class Excercise_2_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(
			"This application prints the diameter,");
		System.out.println(
			"circumference and area");
		System.out.print("Please enter the radius: ");
		int radius = input.nextInt();

		System.out.printf("The diameter is: %d%n", 2 * radius);
		System.out.printf("The circumference is: %.2f%n", 2 * Math.PI * radius);
		System.out.printf("The area is: %.2f%n", Math.PI * radius * radius);
	}
}