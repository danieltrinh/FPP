package Lesson3Homework.Q4;

public final class Rectangle {
	
	private final double width;
	private final double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public final double computeArea()
	{
		return width * height;
	}
	
}
