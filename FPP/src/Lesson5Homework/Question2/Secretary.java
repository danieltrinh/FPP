package Lesson5Homework.Question2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	private double overtimeHours;

	Secretary(String name, double salary, int hireYear, int hireMonth, int hireDate, double overtimeHours)
	{
		super(name, salary, hireYear, hireMonth, hireDate);
		this.overtimeHours = overtimeHours;
	}
	
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(float overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	protected double computeSalary()
	{
		return this.salary + (12 * this.overtimeHours);
	}
	
}
