package Lesson5Homework.Question5;

public class Main {
	
	public static void main(String[] args) {
		Computer c1 = new Computer ("HP", "i7", 4, 2.6);
		System.out.println(c1.toString());
		System.out.println();
		Computer c2 = new Computer ("HP", "i7", 4, 2.6);
		System.out.println(c2.toString());
		
		System.out.println("----------------");
		System.out.println("Compare 2 computers");
		System.out.println(c1.equals(c2));
	}
}
