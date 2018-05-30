package Homework2.Q1;

public class Main {
	public static void main(String[] args) {
		Customer[] cList = new Customer[3];
		
		Customer c1 = new Customer("Daniel", "Trinh", "312-324-453");
		c1.setBillingAddress(new Address("Burliton", "Fairfield", "Iowa", "55233"));
		c1.setShippingAddress(new Address("Burliton", "Fairfield", "Iowa", "55233"));
		
		Customer c2 = new Customer("Kyle", "Joe", "232-445-323");
		c2.setBillingAddress(new Address("Belmont Eve", "Chicago", "Illinois", "42344"));
		c2.setShippingAddress(new Address("Belmont Eve", "Chicago", "Illinois", "42344"));
		
		Customer c3 = new Customer("Leo", "John", "312-324-453");
		c3.setBillingAddress(new Address("Grand Eve", "Chicago", "Illinois", "53423"));
		c3.setShippingAddress(new Address("Grand Eve", "Chicago", "Illinois", "53423"));
		
		cList[0] = c1;
		cList[1] = c2;
		cList[2] = c3;
		
		System.out.println("Customers whose billing address is Chicago");
		for(Customer c: cList)
		{
			if(c.getBillingAddress().getCity() == "Chicago")
				System.out.println(c.toString());
		}		
	}
}
