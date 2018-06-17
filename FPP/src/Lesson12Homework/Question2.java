package Lesson12Homework;

class ExceedBalance extends Exception{
	public ExceedBalance() {
		super();
	};
	
	public ExceedBalance(String msg) {
		super(msg);
	};
}

class LowBalance extends Exception{
	public LowBalance () {
		super();
	};
	
	public LowBalance (String msg) {
		super(msg);
	};
}


class CustomerAccount{
	String cus_name;
	String acc_No;
	double balance;
	
	public CustomerAccount(String cus_name, String acc_No, double balance) {
		this.cus_name = cus_name;
		this.acc_No = acc_No;
		this.balance = balance;
	}

	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withDraw(double amount) throws Exception
	{
		if(amount > balance)
			throw new ExceedBalance("You do not have enough in balance to do this");
		balance -= amount;
		if(balance < 100)
			throw new LowBalance("Your Balance is under 100");
	}
}

public class Question2 {
	
	public static void main(String[] args){
		CustomerAccount c = new CustomerAccount("Daniel Trinh", "32234", 4000);
		try {
			c.deposit(200);
			c.withDraw(5000);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
