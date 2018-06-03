package Lesson5Homework.Question4;

public class Main {
	public static void main(String[] args) {
		Employee[] ems = new Employee[5];
		
		ems[0] = new ComissionEmployee("Chris", "Pratt", "312-534-323", 324, 2);
		ems[1] = new HourlyEmployee("Zoe", "Salnada", "434-545-655", 20, 8);
		ems[2] = new SalariedEmployee("Dave", "Baeutista", "423-565-232", 1000);
		ems[3] = new BasePlusCommisionEmployee("Vin", "Diesel", "453-545-323", 200, 10, 2000);
		ems[4] = new BasePlusCommisionEmployee("Bradley", "Cooper", "433-123-543", 100, 30, 5000);
		
		double sumSalary = 0;
		
		for (Employee e : ems) {
			System.out.println(e.toString());
			System.out.println("----------");
			sumSalary += e.getPayment();
		}
		
		System.out.println("----------------------------");
		System.out.println("Sum Salary of all employees");
		System.out.println(sumSalary);
	}
}

/* OUTPUT 
ComissionEmployee 
[firstName=Chris, lastName=Pratt, socialSecurityNumber=312-534-323] 
Payment: 648.0
----------
HourlyEmployee 
[firstName=Zoe, lastName=Salnada, socialSecurityNumber=434-545-655] 
Payment: 160.0
----------
SalariedEmployee 
[firstName=Dave, lastName=Baeutista, socialSecurityNumber=423-565-232] 
Payment: 1000.0
----------
BasePlusCommisionEmployee 
[firstName=Vin, lastName=Diesel, socialSecurityNumber=453-545-323] 
Payment: 4000.0
----------
BasePlusCommisionEmployee 
[firstName=Bradley, lastName=Cooper, socialSecurityNumber=433-123-543] 
Payment: 8000.0
----------
----------------------------
Sum Salary of all employees
13808.0
 */ 
