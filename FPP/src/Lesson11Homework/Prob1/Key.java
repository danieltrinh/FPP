package Lesson11Homework.Prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(obj.getClass() != this.getClass()) return false;
		Key k = (Key) obj;
		
		if(this.getFirstName().equals(k.getFirstName()) 
				&& this.getLastName().equals(k.getLastName()) 
			)
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
}
