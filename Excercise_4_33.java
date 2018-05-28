// Excercise 4.33: Checkerboard Pattern of Asterisks
// use only:
// System.out.print("* ");
// System.out.print(" ");
// System.out.println()''

public class Excercise_4_33 {
	public static void main(String[] args) {
		int row = 1; //8
		int column = 1;

		while (row <= 8) {
			column = 1;
			if (row % 2 == 1) {
				while(column <= 8){
					System.out.print("* ");
					column++;
				}
			}
			else {
				while(column < 8){
					if( column == 1) {
						System.out.print(" ");
					}
					System.out.print("* ");
					column++;
				}
			}
			row++;
			System.out.println();
		}
	}
}


