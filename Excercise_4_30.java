// Excercise 4.30: Square of Asterisks
// Be aware of the Dangling-else Problem
import java.util.Scanner;

public class Excercise_4_30 {
	public static void main(String[] args) {
		// create a Scanner object
		Scanner input = new Scanner(System.in);

		// prompt the user for the size of a square
		System.out.print("Please enter the size of a square: ");
		int size = input.nextInt();

		// outer iteration statement represents the rows
		int row = 1;
		int column = 1;

		while ( row <= size) {
			// inner iteration statement take care of the columns 
			column = 1; // restart column at each row

			if (row == 1) { // first row
				while (column <= size) {
					System.out.print("*");
					column++;
				}
			}

			if (row == size) { // last row
				while (column <= size) {
					System.out.print("*");
					column++;
				}
			}

			if (row != 1) { // other than first and last row
				if (row != size) {
					while(column <= size){
						if (column == 1){
							System.out.print("*"); // first column
						}
						if (column == size){
							System.out.printf("*");// las column
						}
						if (column != 1) {
							if (column != size) {
								System.out.print(" "); // spaces
							}
						}
						column++;
					}
				}
			}

			// needed expression statements after each row
			System.out.println();
			row++;
		}

	}
}