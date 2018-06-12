package Lesson8Homework.Day2.Question2;

import java.util.Comparator;

public class MarketingComparator implements Comparator<Marketing>{
	
	@Override
	public int compare(Marketing m1, Marketing m2)
	{
		if (Double.compare(m1.salesAmount, m2.salesAmount) != 0)
			return Double.compare(m1.salesAmount, m2.salesAmount);
		else 
			if (m1.employeeName.compareTo(m2.employeeName) != 0)
				return m1.employeeName.compareTo(m2.employeeName);
			else
				return m1.productName.compareTo(m2.productName);
	}
}
