// Excercise 4.18
/*
a) Read the problem statement.
b) Formulate the algorithm using pseudocode and top-down, stepwise refinement.
c) Write a Java program.
d) Test, debug and execute the Java program.
e) Process three complete set of data
*/

// Credite Limit Calculator

/* Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on charge
account. For each customer, the following facts are availabel:
	a) account number
	b) balance at the beginning of the month
	c) total of all items charged by the customer this month
	d) total of all credits applied to the customer's account this month
	e) allowed credit limit

The program should input all these facts as integers, calculate the new
balance ( = beginning balance + charges - credits), display the new
balance and determine wether the new balance exceeds the customer's
credit limit. For the customers whose credit limit is exceeded, the 
program should display the message "Credit limit exceeded".

*/

public class Excercise_4_18 {
	public static void main(String[] args) {
		// account number, monthly start balance, charged items, credit, allowed credit limit
		// account number == 1 ; monthly start balance  == 100 ; 
		// total charged items == 200 ; total credit for the month == 500 ;
		// allowed credit == 0
		ChargeAccount dirkPossardt = 
			new ChargeAccount(1, 100, 200, 500, 0); 
		
		System.out.printf(
			"%nTest if customer with account number %d exceeds credit limit%n -- wait --%n%s%n", 
			dirkPossardt.getAccountNumber(), dirkPossardt.testCustomerExceedsCreditLimit() );

		ChargeAccount stefanBrehme =
			new ChargeAccount(2, 200, 200, 500, 0);

		System.out.printf(
			"%nTest if customer with account number %d exceeds credit limit%n -- wait --%n%s%n", 
			stefanBrehme.getAccountNumber(), stefanBrehme.testCustomerExceedsCreditLimit() );

		ChargeAccount diamantinaPossardt =
			new ChargeAccount(3, 200, 200, 500, 300);

		System.out.printf(
			"%nTest if customer with account number %d exceeds credit limit%n -- wait --%n%s%n", 
			diamantinaPossardt.getAccountNumber(), 
			diamantinaPossardt.testCustomerExceedsCreditLimit() );
	

	}
}