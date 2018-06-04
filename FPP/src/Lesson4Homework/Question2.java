package Lesson4Homework;

public class Question2 {
	
	private static char findMinimum(String s, char min, int position)
	{
		if(position >= s.length())
			return min;
		
		char val = s.charAt(position);
		
		if(min > val)
			min = val;
		
		return findMinimum(s, min, position+1);
	}
	
	public static char findMinimum(String s)
	{
		return findMinimum(s, s.charAt(0), 0);
	}
	
	public static void main(String[] args) {
		System.out.println(findMinimum("scmfsrsecsedasfali"));

	}
}

// OUTPUT
// a