package Lesson5Homework.Question4;

public class ComissionEmployee extends Employee{
	
	private double grossSale;
	private double commissionRate;

	public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		this.grossSale = grossSale;
		this.commissionRate = commissionRate;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return grossSale*commissionRate;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
}
