package Lesson5Homework.Question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DeptEmployee[] department = new DeptEmployee[5];
				
		department[0] = new Professor("Jenifer Lawrence", 20000, 2011, 12, 20, 10);
		department[1] = new Professor("Hugh Jackman", 32000, 2001, 2, 11, 29);
		department[2] = new Professor("James McAvoy", 25000, 2005, 9, 9, 3);
		
		department[3] = new Secretary ("Halle Berry", 50000, 1995, 12, 20, 15.3);
		department[4] = new Secretary ("Michael Fassbender", 45000, 2002, 12, 20, 3.4);
		
		Scanner in = new Scanner(System.in);
		System.out.println("Type Y if you wish to see the sum of all Professor salary, sum of all secretary salary and all salaries in the department");
		
		String input = in.nextLine();
		
		if(input.equals("Y"))
		{
			getSumSalaryOfAllEmployee(department);
		}
	}
	
	public static void getSumSalaryOfAllEmployee(DeptEmployee[] department)
	{
		double sumProfessor = 0;
		double sumSecretary = 0;
		double sumAll = 0;
		for (DeptEmployee e: department)
		{
			if(e instanceof Professor)
				sumProfessor += e.getSalary();
			else if (e instanceof Secretary)
				sumSecretary += e.getSalary();
			
			sumAll += e.getSalary();
		}
		
		System.out.println("Salary of all Professors:");
		System.out.println(sumProfessor);
		System.out.println("Salary of all Secretary:");
		System.out.println(sumSecretary);
		System.out.println("Salary of all Employee:");
		System.out.println(sumAll);
		
	}
	
}

/* OUTPUT
Type Y if you wish to see the sum of all Professor salary, sum of all secretary salary and all salaries in the department
Y
Salary of all Professors:
77000.0
Salary of all Secretary:
95000.0
Salary of all Employee:
172000.0
*/
