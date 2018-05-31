package Homework2.Q4;

public class Circle {
	
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public final double computeArea()
	{
		return Math.PI * radius * radius;
	}
	
}
