package Lesson8Homework.Day2.Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ArrayList<Marketing> objs = new ArrayList<>();

		objs.add(new Marketing("Daniel", "Ipad", 31233.543));
		objs.add(new Marketing("Kyle", "Iphone", 234.45));
		objs.add(new Marketing("Leo", "MacBook", 443123.543));
		objs.add(new Marketing("Ethan", "Imac", 6123234.324));
		objs.add(new Marketing("Ethan", "Ikea", 5123234.324));
		objs.add(new Marketing("Ethan", "Ikea", 223.324));
		objs.add(new Marketing("Nathaniel", "Iwatch", 213.43));

		System.out.println("Full list :");
		System.out.println(objs);

		objs.remove(2);
		System.out.println("after removing element at index 2 :");
		System.out.println(objs);

		System.out.println("List size:");
		System.out.println(objs.size());

		System.out.println("Sorted List:");
		Collections.sort(objs, new MarketingComparator());
		System.out.println(objs);

		System.out.println("Sorted List of employe with sales > 1000:");
		System.out.println(listMoreThan1000(objs));
	}

	public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		// Implement a body
		
		List <Marketing> l = new ArrayList<>();
		for (Marketing m : list) {
			if(m.salesAmount > 1000)
			{
				l.add(m);
			}
		}
		Collections.sort(l, new MarketingComparator());
		return l;
	}
}
