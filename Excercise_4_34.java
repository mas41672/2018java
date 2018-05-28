// Excercise 4.34: Multiples of 2 with an Infinite Loop
public class Excercise_4_34 {
	public static void main(String[] args){
		int integer = 2;
		int counter = 1;
		while (counter <= 10) {
			integer *=2;
			System.out.printf("%d%n", integer);
		}
	}
}