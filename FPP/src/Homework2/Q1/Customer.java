package Homework2.Q1;

public class Customer {
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	
	private Address billingAddress;
	private Address shippingAddress;
	
	
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	
}
