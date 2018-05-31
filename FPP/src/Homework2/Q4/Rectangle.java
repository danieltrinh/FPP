package Homework2.Q4;

public class Rectangle {
	private final double base;
	private final double height;
	
	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public final double computeArea()
	{
		return 1/2 * base * height;
	}
	
}
