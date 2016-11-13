package printNames;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	String firstName;
	String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person: firstName:" + firstName + " lastName:" + lastName;
	}

}
