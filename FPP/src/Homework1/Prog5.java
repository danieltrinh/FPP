package Homework1;

public class Prog5 {
	public static void main(String[] args) {
		int[][] r = new int[4][4];
		for(int i=0; i < r.length; i++)
		{
			for(int j=0; j < r.length; j++)
			{
				r[i][j] = RandomNumbers.getRandomInt(1, 99);
			}
		}
		
		for(int i = 0; i < r.length; i++)
		{
			// print number list
			for(int j = 0; j < r.length; j++)
			{
				if( i%2 != 0)
					System.out.printf(" + " + r[i][j] + "\t");
				else
					System.out.printf("   " + r[i][j] + "\t");
			}
			System.out.println();
			
			// print horizontal lines
			if( i%2 != 0)
			{
				for(int j = 0; j < r.length; j++)
				{
					System.out.print("______\t");
				}
				System.out.println();
				System.out.println();
			}
		}
	}
}
