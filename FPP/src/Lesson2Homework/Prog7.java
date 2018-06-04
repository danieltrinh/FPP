package Lesson2Homework;

public class Prog7 {
	public static void main(String[] args) {
		int len = 0;
		if(args != null)
			len = args.length;
		
		int inputsStartWithA = 0;
		
		for(int i = 0; i<len; i++)
		{
			System.out.println(args[i]);
			System.out.println("String length of args[" + i + "]:" + args[i].length());
			if(args[i].startsWith("A") || args[i].startsWith("a"))
				inputsStartWithA++;
		}
		
		System.out.println("Number of Inputs start with A :" + inputsStartWithA);
	}
}
