package Lesson4Homework;

public class Question1 {

	StringBuilder res = new StringBuilder();

	public String mergeTwoSorted(String s1, String s2)
	{
		if(s1 == "" || s1.length() == 0)
		{
			res.append(s2);
			return s2;
		}
		if(s2 == "" || s2.length() == 0)
		{
			res.append(s1);
			return s1;
		}
			
		char temp1 = s1.charAt(0);
		char temp2 = s2.charAt(0);
		
		if(temp1 < temp2)
		{
			res.append(temp1);
			return mergeTwoSorted(s1.substring(1), s2);
		}
		else {
			res.append(temp2);
			return mergeTwoSorted(s2.substring(1), s1);
		}
	}
	
	public static void main(String[] args) {
		Question1 q1 = new Question1();
		
		q1.mergeTwoSorted("ace", "bdf");
		System.out.println(q1.res);
		
		//OUTPUT
		//abcdef
	}
}
