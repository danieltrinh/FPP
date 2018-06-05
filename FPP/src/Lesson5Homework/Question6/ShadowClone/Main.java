package Lesson5Homework.Question6.ShadowClone;

import Lesson5Homework.Question5.Computer;

public class Main {
	public static void main(String[] args)  throws CloneNotSupportedException  {
		
		// Shallow Copy
		Person p1 = new Person("Daniel", new Computer ("HP", "i7", 4, 2.6));
		System.out.println("P1:");
		System.out.println(p1);
		System.out.println("-------");
		
		Person p2 = (Person) p1.clone();
		System.out.println("P2:");
		System.out.println(p2);
	}
}


/*
P1:
Daniel's computer 
Computer from manufacturer : HP
Processor : i7
RAM Size : 4
Processor Speed : 2.6
-------
P2:
Daniel's computer 
Computer from manufacturer : HP
Processor : i7
RAM Size : 4
Processor Speed : 2.6
*/