// Excercise 2.16
// Feat: Comparing two integers
/* Compare to numbers using the standard system input object
Scanner and the standard input object 'System.out' with it's
methods 'println' and 'printf'. For the prompt, the method 
'print' is ideal. The method used in the input is 'intNext()'.*/ 
import java.util.Scanner;

public class Excercise_2_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Comparing two integers...");
		
		System.out.print("Enter first integer: ");
		int integer1 = input.nextInt();

		System.out.print("Enter second integer: ");
		int integer2 = input.nextInt();

		if (integer1 < integer2) {
			System.out.printf("%d is larger%n", integer2);
		}
		
		if (integer2 < integer1) {
			System.out.printf("%d is larger%n", integer1);
		}
		
		if (integer1 == integer2) {
			System.out.println("These numbers are equal");
		}

	}
}