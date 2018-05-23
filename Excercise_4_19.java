// Excercise 4.19
// Sales Commision Calculator

/*
a) Read the problem statement.
b) Formulate the algorithm using pseudocode and top-down, stepwise refinement.
c) Write a Java program.
d) Test, debug and execute the Java program.
e) Process three complete sets of data
*/

/*
import Scanner

class stuff

set counter to zero
set sales to zero
prompt the user to enter the sale and display falg value

while flag value not entered
	add to the running total
	increase counter

	prompt the user to enter the next sale and display falg value

calculate the commision or better the earnings
*/
import java.util.Scanner;

public class Excercise_4_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float runningTotal = 0;

		System.out.print("Please enter the next sale (or -1 to quit): ");
		float sales = input.nextFloat();

		while( -1.0 != sales ) {
			runningTotal += sales;

			System.out.print("Please enter the next sale (or -1 to quit): ");
			sales = input.nextFloat();

		}

		System.out.printf("The total of all sales is: %.2f%n", runningTotal);
		System.out.printf("The 9%% commision  of the all sales is: %.2f%n", runningTotal * 0.09);
		System.out.printf("The total earnings are $200 plus the commision: %.2f%n%n",
			runningTotal * 0.09 + 200 );
	}
}