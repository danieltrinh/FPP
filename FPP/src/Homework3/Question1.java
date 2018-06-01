package Homework3;

public class Question1 {
	StringBuilder res = new StringBuilder();

	public String mergeTwoSorted(String s1, String s2)
	{
		
		if(s1 == "" || s1 == null || s1.length() == 1)
			return s2;
		if(s2 == "" || s2 == null || s2.length() == 1)
			return s1;
			
		char temp1 = s1.charAt(0);
		char temp2 = s2.charAt(0);
		
		if(temp1 < temp2)
		{
			res.append(temp1);
			printProgress(temp1,temp2);
			return mergeTwoSorted(s1.substring(1), s2);
		}
		else {
			res.append(temp2);
			printProgress(temp1,temp2);
			return mergeTwoSorted(s2.substring(1), s1);
		}
	}
	
	public static void main(String[] args) {
		Question1 q1 = new Question1();
		
		q1.mergeTwoSorted("acex", "bdfxz");
		System.out.println(q1.res);
	}
	
	void printProgress(char t1, char t2)
	{
		if(t1 < t2)
			System.out.printf("%s < %s \n", t1, t2);
		else
			System.out.printf("%s <= %s \n", t2, t1);
		System.out.println("Big String: " + res);
	}
}
