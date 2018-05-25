// Excercise 4.22
// print a tabele

public class Excercise_4_22 {
	public static void main(String[] args) {
		System.out.println("N	10*N	100*N	1000*N\n");

		int counter = 1;

		while ( counter<= 5) {

			System.out.printf(
				"%d       %d      %d     %d%n",
		         counter, counter*10, counter*100, counter*1000);
			counter++;
		}
	}
}