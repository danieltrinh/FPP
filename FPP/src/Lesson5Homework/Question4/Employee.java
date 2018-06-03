package Lesson5Homework.Question4;

abstract class Employee {
	String firstName;
	String lastName;
	String socialSecurityNumber;
	
	public abstract double getPayment();

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ":\n\tfirstName= "
				+ firstName + "\n\tlastName= " + lastName + "\n\tsocialSecurityNumber= " + socialSecurityNumber + "\n\tPayment: " + getPayment();
	}
}
