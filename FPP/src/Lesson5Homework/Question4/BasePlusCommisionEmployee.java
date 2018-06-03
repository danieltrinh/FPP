package Lesson5Homework.Question4;

public class BasePlusCommisionEmployee extends ComissionEmployee{
	private double baseSalary;

	public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale,
			double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
		this.baseSalary = baseSalary;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return baseSalary + (grossSale * commissionRate);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
}
