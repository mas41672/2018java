// Excercise 4.17
/*
a) Read problem statement
b) Formulate the algorithm using pseudocode and top-down, 
   stepwise refinement.
c) Write a Java program.
d) Test, debug and execute the Java program.
e) Process three complete sets of data

Prompt the user to input for each trip the milage and the gallons.
Print for each trip the mileage per gallons. Print the milage per 
gallons for all trips. Floating-point results should be used.
dSentinel-controlled iteration is required.

*** Top-down stepwise refinement
set counter to zero
set running mileage total to zero
set running gallons total to zero
Prompt the user to input the mileage and the gallons consumed 
(sentinel)

iteration statement - while sentinel value is not entered
	add one to counterS
 	read the mileage and the gallons from the user (floating-point)
 	calculate the miles per gallon for each trip
 	print the miles per gallon for this spefied trip

 	add the mileage to the running mileage total
 	add the gallons to the running gallons total

 	prompt the user to input a new trip - mileage and gallons or
 	the sentinal value

print the combined miles per gallon obtained from all trips

*/

import java.util.Scanner;

public class Excercise_4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int counter = 0;
		float mileageTotal = 0; 
		float gallonsTotal = 0; 

		System.out.print("Please enter the miles and gallons for the last trip (or twice -1 to quit): \n");
		System.out.println("Gallons: ");
		float gallons = input.nextFloat();
		System.out.println("Miles: ");
		float mileage = input.nextFloat();

		while(gallons != -1) {
			System.out.printf("%nThe miles per gallons are: %.2f%n", mileage/gallons);

			mileageTotal += mileage;
			gallonsTotal += gallons;

			System.out.print("\nPlease enter the miles and gallons for the last trip (or twice -1 to quit): \n");
			System.out.println("Gallons: ");
			gallons = input.nextFloat();
			System.out.println("Miles: ");
			mileage = input.nextFloat();

			counter++;
		}

		if ( 0 == counter ) {
			System.out.println("No trip data was entered.");
		}
		else {
			System.out.printf("%nThe average miles per gallon is: %.2f%n", mileageTotal / gallonsTotal);
		}
	}
}