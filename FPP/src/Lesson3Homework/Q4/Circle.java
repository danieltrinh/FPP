package Lesson3Homework.Q4;

public class Circle {
	
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public final double computeArea()
	{
		return Math.PI * radius * radius;
	}
	
}
