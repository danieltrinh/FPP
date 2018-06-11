package InClassPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestShoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Shopping> list = new ArrayList<>();
		
		list.add(new Shopping("Ipad", 309));
		list.add(new Shopping("Imac", 1309));
		list.add(new Shopping("Iphone", 599));
		list.add(new Shopping("Iwatch", 209));
		
//		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(total(list));
		
		System.out.println(more200(list));
		
		Collections.sort(list, new ShoppingNameComparator());
		System.out.println(list);

		Collections.sort(list, new ShoppingPriceComparator());
		System.out.println(list);

	}
	static double total ( List<Shopping> list)
	{
		double sum = 0 ;
		for (Shopping s : list) {
			sum += s.getPrice();
		}
		return sum;
	}
	
	static List<Shopping> more200(List<Shopping> list)
	{
		List<Shopping> temp = new ArrayList();
		
		for (Shopping l : list) {
			if(l.getPrice()>200)
				temp.add(l);
		}
		
		return temp;
	}

}
