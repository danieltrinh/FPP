package Lesson3Homework.Q4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter C for Circle\r\n" + 
				"Enter R for Rectangle\r\n" + 
				"Enter T for Triangle");
		
		String input = in.nextLine();
		
		switch(input)
		{
			case "C":
				System.out.println("Enter the Radius: ");
				double radius = in.nextDouble();
				Circle c = new Circle(radius);
				System.out.println("The area of Circle is: " + c.computeArea());
				break;
			case "R":
				System.out.println("Enter the width: ");
				double tWidth = in.nextDouble();
				System.out.println("Enter the height: ");
				double tHeight = in.nextDouble();
				Rectangle r = new Rectangle(tWidth, tHeight);
				System.out.println("The area of Rectangle is: " + r.computeArea());
				break;
			case "T":
				System.out.println("Enter the base: ");
				double base = in.nextDouble();
				System.out.println("Enter the height: ");
				double height = in.nextDouble();
				Triangle t = new Triangle(base, height);
				System.out.println("The area of Triangle is: " + t.computeArea());
				break;
		}
	}
}
