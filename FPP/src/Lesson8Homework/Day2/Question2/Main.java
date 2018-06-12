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

		System.out.println("Sorted List by sales amount:");
		Collections.sort(objs, new MarketingComparator());
		System.out.println(objs);

		System.out.println("Sorted List by Employee Name of employee with sales > 1000:");
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
		Collections.sort(l, new MarketingEmployeeNameComparator());
		return l;
	}
}

/* OUTPUT

Full list :
[employeeName=Daniel, productName=Ipad, salesAmount=31233.543
, employeeName=Kyle, productName=Iphone, salesAmount=234.45
, employeeName=Leo, productName=MacBook, salesAmount=443123.543
, employeeName=Ethan, productName=Imac, salesAmount=6123234.324
, employeeName=Ethan, productName=Ikea, salesAmount=5123234.324
, employeeName=Ethan, productName=Ikea, salesAmount=223.324
, employeeName=Nathaniel, productName=Iwatch, salesAmount=213.43
]
after removing element at index 2 :
[employeeName=Daniel, productName=Ipad, salesAmount=31233.543
, employeeName=Kyle, productName=Iphone, salesAmount=234.45
, employeeName=Ethan, productName=Imac, salesAmount=6123234.324
, employeeName=Ethan, productName=Ikea, salesAmount=5123234.324
, employeeName=Ethan, productName=Ikea, salesAmount=223.324
, employeeName=Nathaniel, productName=Iwatch, salesAmount=213.43
]
List size:
6
Sorted List by sales amount:
[employeeName=Nathaniel, productName=Iwatch, salesAmount=213.43
, employeeName=Ethan, productName=Ikea, salesAmount=223.324
, employeeName=Kyle, productName=Iphone, salesAmount=234.45
, employeeName=Daniel, productName=Ipad, salesAmount=31233.543
, employeeName=Ethan, productName=Ikea, salesAmount=5123234.324
, employeeName=Ethan, productName=Imac, salesAmount=6123234.324
]
Sorted List by Employee Name of employee with sales > 1000:
[employeeName=Daniel, productName=Ipad, salesAmount=31233.543
, employeeName=Ethan, productName=Ikea, salesAmount=5123234.324
, employeeName=Ethan, productName=Imac, salesAmount=6123234.324
]


*/