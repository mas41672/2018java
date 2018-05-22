// Excercise 4.18
// class for charge account app

public class ChargeAccount {
	private int accountNumber;
	private float startMonthBalance;
	private float totalChargedItems;
	private float totalOfCredits;
	private float allowedCreditLimit;

	// constructer for class ChargeAccount
	public ChargeAccount(
		int accountNumber, float startMonthBalance, 
		float totalChargedItems, float totalOfCredits,
		float allowedCreditLimit) {
			
			this.accountNumber = accountNumber;   // 1

			if (startMonthBalance >= 0) {  // 2
				this.startMonthBalance = startMonthBalance;
			}
			else {
				this.startMonthBalance = 0;
			}

			if (totalChargedItems >= 0) { // 3
				this.totalChargedItems = totalChargedItems;
			}
			else {
				this.totalChargedItems = 0;
			}

			if (totalOfCredits >= 0) { // 4
				this.totalOfCredits = totalOfCredits;
			}
			else {
				this.totalOfCredits = 0;
			}

			if (allowedCreditLimit >= 0) { // 5
				this.allowedCreditLimit = allowedCreditLimit;
			}
			else {
				this.allowedCreditLimit = 0;
			}
	}

	// set method of the account number // 1
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// retrieve account number // 1
	public int getAccountNumber() {
		return this.accountNumber;
	}

	// set method of the month balance // 2
	public void setStartMonthBalance(float startMonthBalance) {
		this.startMonthBalance = startMonthBalance;
	}

	// retrieve the month balance // 2
	public float getStartMonthBalance() {
		return this.startMonthBalance;
	}

	// set total charged items // 3
	public void setTotalChargedItems(float totalChargedItems) {
		this.totalChargedItems = totalChargedItems;
	}

	// retrieve total charged itms // 3
	public float getTotalChargetItems() {
		return this.totalChargedItems;
	}

	// set the total of credits // 4 
	public void setTotalOfCredits(float totalOfCredits) {
		this.totalOfCredits = totalOfCredits;
	}

	// get the total of credits // 4
	public float getTotalOfCredits() {
		return totalOfCredits;
	}

	// set the allowed credit limit // 5
	public void setTheAllowedCreditLimit(float allowedCreditLimit) {
		this.allowedCreditLimit = allowedCreditLimit;
	}

	// retrieve the allowed credit limit // 5
	public float getTheAllowedCreditLimit() {
		return this.allowedCreditLimit;
	} 

	// retrieve the balance of the charge account
	public float getNewBalance() {
		return this.startMonthBalance + this.totalChargedItems - this.totalOfCredits;	
	}

	// test if credit limit is exceeded
	public String testCustomerExceedsCreditLimit() {
		if ( getNewBalance() + getTheAllowedCreditLimit() < 0) {
			return "Credit limit exceeded";
		}
		return "Credit limit not exceeded";
	}

}