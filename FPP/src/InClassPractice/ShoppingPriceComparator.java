package InClassPractice;

import java.util.Comparator;

public class ShoppingPriceComparator implements Comparator<Shopping>{

	@Override
	public int compare(Shopping s1, Shopping s2) {
		return Double.compare(s1.getPrice(), s2.getPrice());
	}
	
}
