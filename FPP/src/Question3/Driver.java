package Question3;

public class Driver {
	public static void main(String[] args) {
		Figure[] fs = new Figure[5];
		
		fs[0] = new UpwardHat();
		fs[1] = new UpwardHat();
		fs[2] = new DownwardHat();
		fs[3] = new FaceMaker();
		fs[4] = new Vertical();
		
		printFigure(fs);
		System.out.print("\n---------\n");
		printFigureWithName(fs);
	}
	
	public static void printFigure(Figure[] fs)
	{
		for (Figure f : fs) {
			f.getFigure();
		}
	}
	
	public static void printFigureWithName(Figure[] fs)
	{
		for (Figure f : fs) {
			System.out.printf("%s : " ,f.getClass().getSimpleName());
			f.getFigure();
			System.out.println();
		}
	}
}
