package Lesson5Homework.Question6.DeepClone;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Daniel", new Computer("Dell", "i5", 16, 3.2));
		System.out.println(p1);
		
		System.out.println("----------");
		
		Person p2 = (Person) p1.clone();
		System.out.println(p2);
	}
}

/* OUTPUT
Daniel's computer 
Computer from manufacturer : Dell
Processor : i5
RAM Size : 16
Processor Speed : 3.2
----------
Daniel's computer 
Computer from manufacturer : Dell
Processor : i5
RAM Size : 16
Processor Speed : 3.2
*/