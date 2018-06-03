package Lesson5Homework.Question2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	private int numberOfPublications;

	public Professor(String name, double salary, int hireYear, int hireMonth, int hireDate, int numberOfPublications) {
		super(name, salary, hireYear, hireMonth, hireDate);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	
}
