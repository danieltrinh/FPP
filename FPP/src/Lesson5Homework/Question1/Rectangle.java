package Lesson5Homework.Question1;

public class Rectangle extends Shape{
	
	double width;
	double height;
	
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}	
	
	public double calculateArea()
	{
		return width * height;
	}
	
	public double calculatePerimeter()
	{
		return 2 * (width + height);
	}
	
}
