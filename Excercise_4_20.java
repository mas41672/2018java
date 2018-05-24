// Excercise 4.20 
// Salary Calculator

import java.util.Scanner;

public class Excercise_4_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// prompt the user to enter an employee
		System.out.print("Do you want to calculate the gross pay of an employee?\n (enter 1 to continue, enter -1 to quit)?: ");
		int moreEmployees = input.nextInt();

		while (moreEmployees != -1) {
			System.out.print("Please enter the hourly rate: ");
			double hourlyRate = input.nextDouble();
			System.out.print("Please enter the hours worked in a week: ");
			double hoursWorked = input.nextDouble();
			if (hoursWorked <= 40 ) {
				System.out.printf(
					"The gross pay is: %.2f%n", hourlyRate * hoursWorked);
			}
			else {
				System.out.printf(
					"The gross pay is: %.2f%n", 40 * hourlyRate + (hoursWorked - 40) * 1.5);
			}

			System.out.print("Do you want to calculate the gross pay of an employee?\n (enter 1 to continue, enter -1 to quit)?: ");
			moreEmployees = input.nextInt();
		}
	}
}