package Lesson5Homework.Question2;

import java.time.LocalDate;

public class DeptEmployee {
	protected String name;
	protected double salary;
	protected LocalDate hiredate;
	
	public DeptEmployee(String name, double salary, int hireYear, int hireMonth, int hireDate) {
		this.name = name;
		this.salary = salary;
		this.hiredate = LocalDate.of(hireYear, hireMonth, hireDate);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	protected double computeSalary()
	{
		return this.salary;
	}
}
