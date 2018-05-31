package Homework2.Q4;

public class Triangle {
	private final double width;
	private final double height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public final double computeArea(double width, double height)
	{
		return width * height;
	}
}
