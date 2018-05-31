package Homework2.Q2;

public class Main {
	public static void main(String[] args) {
		Employee em = new Employee("Daniel", "DD",  10000, 2015, 12, 20);
		
		Account ac = new Account(em, AccountType.CHECKING, 300);
		Account as = new Account(em, AccountType.SAVINGS, 300);
		Account ar = new Account(em, AccountType.RETIREMENT, 300);
		
		ac.makeDeposit(200);
		ac.makeWithdrawal(30);
		ac.makeDeposit(300);
		ac.makeWithdrawal(40);
		System.out.println(ac);
		
		as.makeDeposit(200);
		as.makeWithdrawal(900);
		as.makeWithdrawal(40);
		System.out.println(as);
		
		ar.makeDeposit(100);
		ar.makeWithdrawal(200);
		ar.makeWithdrawal(33);
		System.out.println(ar);
		
	}
}
