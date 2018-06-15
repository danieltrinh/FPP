package Lesson11Homework.Prob3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import Lesson11Homework.Prob3.util.Util;

public class EmployeeInfo {
	
	/**
	 * Removes from a copy of the input list all duplicate Employees,
	 * and then returns this list.
	 * 
	 * An Employee instance is considered to be a duplicate of another Employee
	 * instance if the two instances have the same name and salary.
	 */
	public static List<Employee> removeDuplicates(List<Employee> employees) {
		//IMPLEMENT
		
		 //Using loop
//		Iterator<Employee> it = employees.iterator();
//		List<Employee> result = new ArrayList<>();
//		while(it.hasNext())
//		{
//			Employee temp = it.next();
//			if(!result.contains(temp))
//			{
//				result.add(temp);
//			}
//		}
//		return result;
		
		//Using Recursion
		if(employees.isEmpty()) return null;
		if(employees.size() == 1) return employees;
		
		Employee first = employees.get(0);
		List<Employee> smallList = employees.subList(1, employees.size());
		if(smallList.contains(first))
		{
			return removeDuplicates(smallList);
		}
		else
		{
			List<Employee> list = removeDuplicates(smallList);
			list.add(first); 
			return list;
		}
	}
	
	
	//DO NOT MODIFY
	/**
	 * Use the main method to test your solution
	 */
	public static void main(String[] args) {	
		List<Employee> myDupsRemoved = removeDuplicates(TestData.originalList);
		boolean dupsCorrectlyRemoved = Util.listsAreEqual(TestData.dupsRemoved, myDupsRemoved);
		System.out.println("Is answer correct? " + dupsCorrectlyRemoved);
	}

	 
}
