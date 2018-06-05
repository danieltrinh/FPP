package Lesson5Homework.Question1;

public class Main {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		
		shapes[0] = new Circle("blue", 20);
		shapes[1] = new Circle("red", 30);
		shapes[2] = new Rectangle("green", 20, 50);
		shapes[3] = new Square("blue", 35);
		shapes[4] = new Rectangle("purple", 33, 44);
		
		printTotal(shapes);
	}
	
	public static void printTotal(Shape[] shapes)
	{ 
		// Implement your code
		for( Shape s : shapes )
		{
			System.out.printf("Shape %s %s:\n", s.color, s.getClass().getSimpleName());
			System.out.printf("Area: %f \n" ,  s.calculateArea());
			System.out.printf("Perimeter: %f\n", s.calculatePerimeter());
			System.out.println("--------------");
		}
	}
}

/* OUTPUT
Shape blue Circle:
Area: 1256.637061 
Perimeter: 125.663706
--------------
Shape red Circle:
Area: 2827.433388 
Perimeter: 188.495559
--------------
Shape green Rectangle:
Area: 1000.000000 
Perimeter: 140.000000
--------------
Shape blue Square:
Area: 1225.000000 
Perimeter: 140.000000
--------------
Shape purple Rectangle:
Area: 1452.000000 
Perimeter: 154.000000
--------------
 */