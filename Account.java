// Fig. 3.5: Account.java
// Account class that contains a name instance variable
// and methods to set and get its value

public class Account {
	private String name; // instance variable

	// constructor initializes name with parameter name
	public Account(String name) { // constructor name is class name
		this.name = name;
	}

	// method to set the name in the object
	public void setName(String name) {
		this.name = name; // store the naem
	}

	// method to retrieve the name from the object
	public String getName() {
		return name; // return value of name to caller
	}
}