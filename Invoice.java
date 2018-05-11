// Excercise 3.12 
// Invoice class

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNumber, String partDescription,
		int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
		if ( quantity < 0) {
			this.quantity = 0;
		}
		if (pricePerItem < 0) {
			this.pricePerItem = 0;
		}
	}

	// set the part number
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	// get the part number
	public String getPartNumber() {
		return partNumber;
	}

	// set the part Description
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	// get the part Description
	public String getPartDescription() {
		return partDescription;
	}

	// set the quantity
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		if ( quantity < 0) {
			this.quantity = 0;
		}
	}

	// get the quantity
	public int getQuantity() {
		return quantity;
	}

	// set the price per item
	public void setThePricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
		if (pricePerItem < 0) {
			this.pricePerItem = 0;
		}
	}

	// get the price per item
	public double getThePricePerItem() {
		return pricePerItem;
	} 

	// get invoice amount
	public double getInvoiceAmount() {
		double getInvoiceAmount = ((double) quantity * pricePerItem);
		if (getInvoiceAmount < 0) {
			getInvoiceAmount = 0;
		}
		return getInvoiceAmount;
	}

}