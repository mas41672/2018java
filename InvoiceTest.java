// Excercise 3.12 
// driver class 'InvoiceTest' of class 'Invoice'

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice computerTuxedo = new Invoice("1", "Tuxedo notebook", 10, 399.75);
		Invoice computerTuxedoABC = new Invoice("2", "Tuxedo notebook2", 30, -50);

		System.out.printf(
			"%nThe part number: \"%s\" of the part: \"%s\"%nQuantity: %d, Price per Item: $%.2f%n%n",
			computerTuxedo.getPartNumber(), // String output
			computerTuxedo.getPartDescription() , // String outtput
			computerTuxedo.getQuantity(), // decimal integer
			computerTuxedo.getThePricePerItem()); // doubles

		System.out.println(
			"Change the part description form 'Tuxedo notebook' to 'Tuxedo Nobebook New'");
		computerTuxedo.setPartDescription("Tuxedo Notebook New");
		System.out.printf("The object 'computerTuxedo' has a new part description: %s%n%n",
			computerTuxedo.getPartDescription());

		System.out.println("Change the part number from '1' to '100'");
		System.out.printf("The old part number is: %s%n", computerTuxedo.getPartNumber());
		computerTuxedo.setPartNumber("100");
		System.out.printf("The new part number is: %s%n%n", computerTuxedo.getPartNumber());

		System.out.println("Change the quantity from '10' to '12'.");
		System.out.printf("The old quantity of New Tuxedo Computers is: %d%n", computerTuxedo.getQuantity());
		computerTuxedo.setQuantity(12);
		System.out.printf("The new quantity of New Tuxedo Computers is: %d%n%n", computerTuxedo.getQuantity());

		System.out.println("Change the price from $399.75 to $10");
		System.out.printf("The old price per item is: $%.2f%n", computerTuxedo.getThePricePerItem());
		computerTuxedo.setThePricePerItem(10);
		System.out.printf("The new price per item is: $%.2f%n%n", computerTuxedo.getThePricePerItem());	 

		System.out.println("Print the invoice amount");
		System.out.printf("The invoice amount is: %.2f%n%n", computerTuxedo.getInvoiceAmount());

		System.out.println("Try to change quantity into negative value of '-10'");
		computerTuxedo.setQuantity(-10);
		System.out.printf("The quantity is not negative: %d%n%n", computerTuxedo.getQuantity());

		System.out.println("Try to change the price to a negative value of '$-100'");
		computerTuxedo.setThePricePerItem(-100);
		System.out.printf("The price is not negative: $%.2f%n%n", computerTuxedo.getThePricePerItem());

	}
}