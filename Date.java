// Excercise 3.14
public class Date {
	private int month;
	private int day;
	private int year;

	// constructor
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}


	// set and get methods of the instance variables
	public void setMonth(int month) {
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}
	
	// display date
	public void displayDate() {
		System.out.printf(
			"%d/%d/%d%n%n", getMonth(), getDay(), getYear());
	}

}