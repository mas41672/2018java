// Excercise 3.13
// driver class for Employee
public class EmployeeTest {
	public static void main(String[] args){
		Employee dirkPossardt = new Employee("Dirk","Possardt",2500.00);
		Employee stephanBrehme = new Employee("Stefan", "Brehme", 2501.00);

		System.out.printf(
			"Employee 'dirkPossardt' has %nfirst name: %s%nlast name: %s%nmonthly salary: %.2f%n%n",
		dirkPossardt.getFirstName(),
		dirkPossardt.getLastName(),
		dirkPossardt.getMonthlySalary());

		System.out.println("Set the first name to: Dirko");
		dirkPossardt.setFirstName("Dirko");
		System.out.printf("Employee 'dirkPossardt's' first name is now:%n%s%n%n", 
			dirkPossardt.getFirstName());
		
		System.out.println("Set the last name to: Bethancourt");
		System.out.printf(
			"The actual last name of the Employee 'dirkPossardt is:%n%s%n",
			dirkPossardt.getLastName());
		dirkPossardt.setLastName("Bethancourt");
		System.out.printf(
			"The last name of the Employee 'dirkPossardt' is now:%n%s%n%n",
			dirkPossardt.getLastName());

		System.out.println(
			"Trying to set the monthly salary to a negative value");
		dirkPossardt.setMonthlySalary(-100);
		System.out.printf("The monthly salary is now set to:%n%.2f%n",
			dirkPossardt.getMonthlySalary());
		System.out.println("This means the salary hasn't changed.\n");

		System.out.printf(
			"%s %s's yearly salary is $%.2f%n",
			dirkPossardt.getFirstName(),
			dirkPossardt.getLastName(),
			dirkPossardt.getMonthlySalary() * 12);
		System.out.printf(
			"%s %s's yearly salary is $%.2f%n%n",
			stephanBrehme.getFirstName(),
			stephanBrehme.getLastName(),
			stephanBrehme.getMonthlySalary() *12); 

		System.out.println("All employee's will get a salarys increase.");
		dirkPossardt.setMonthlySalary( dirkPossardt.getMonthlySalary() * 1.10);
		stephanBrehme.setMonthlySalary(stephanBrehme.getMonthlySalary() * 1.10);

		System.out.printf(
			"%s %s's yearly salary is $%.2f%n",
			dirkPossardt.getFirstName(),
			dirkPossardt.getLastName(),
			dirkPossardt.getMonthlySalary() * 12);
		System.out.printf(
			"%s %s's yearly salary is $%.2f%n%n",
			stephanBrehme.getFirstName(),
			stephanBrehme.getLastName(),
			stephanBrehme.getMonthlySalary() *12); 



	}
}