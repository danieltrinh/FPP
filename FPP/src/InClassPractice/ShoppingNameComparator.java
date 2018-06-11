package InClassPractice;

import java.util.Comparator;

public class ShoppingNameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Shopping s1 = (Shopping) o1;
		Shopping s2 = (Shopping) o2;
		
		return s1.getName().compareTo(s2.getName());
	}
	
}
