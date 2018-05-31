package Homework2.Q3.employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		//update, using LocalDate
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	
	public void createNewChecking(double startAmount) {
		// implement
		this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		// implement
		this.savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public String getFormattedAcctInfo() {
		// implement
		String result = "";
		if(this.checkingAcct!=null)
			result += this.checkingAcct.toString() + "\n";
		if(this.savingsAcct!=null)
			result += this.savingsAcct.toString() + "\n";
		if(this.retirementAcct!=null)
			result += this.retirementAcct.toString() + "\n";
		
		return result;
	}
	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}


	public void deposit(String acctType, double amt){
		// implement
		switch(acctType)
		{
			case "CHECKING":
				checkingAcct.makeDeposit(amt);
				break;
			case "SAVINGS":
				savingsAcct.makeDeposit(amt);
				break;
			case "RETIREMENT":
				retirementAcct.makeDeposit(amt);
				break;
		}
	}
	public boolean withdraw(String acctType, double amt){
		// implement
		switch(acctType)
		{
			case "CHECKING":
				return checkingAcct.makeWithdrawal(amt);
			case "SAVINGS":
				return savingsAcct.makeWithdrawal(amt);
			case "RETIREMENT":
				return retirementAcct.makeWithdrawal(amt);
		}
		return false;
	}

}
