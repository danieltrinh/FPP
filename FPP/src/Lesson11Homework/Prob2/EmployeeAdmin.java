package Lesson11Homework.Prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> result = new ArrayList<>();
		
		Iterator<Map.Entry<String, Employee>> it = table.entrySet().iterator();
		
		Map.Entry<String, Employee> temp = null;
		
		while(it.hasNext())
		{
			temp = it.next();
			if(socSecNums.contains(temp.getKey()) 
					&& temp.getValue().getSalary() > 80000
					)
			{
				result.add(temp.getValue());
			}
		}
		
		Collections.sort(result, new EmployeeComparator());
		
		return result;
		
	}
	
}
