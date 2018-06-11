package Lesson8Homework.Question2;

class Person {
	private String lastName;
	private String firstName;
	private int age;
	
	// --------------------------------------------------------------
	public Person(String last, String first, int a) { // constructor
		lastName = last;
		firstName = first;
		age = a;
	}
	
	// --------------------------------------------------------------
	public String getLast() // get last name
	{
		return lastName;
	}
	
	public String getFirst() // get last name
	{
		return firstName;
	}
	
	public int getAge() // get last name
	{
		return age;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + "; FirstName=" + firstName + "; Age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if(lastName.equals(other.lastName) && firstName.equals(other.firstName) && age == other.age)
			return true;
		return false;
	}
	
	
} // end class Person