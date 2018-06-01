package Homework3;

public class Question4 {
	public static boolean palindrome(String s)
	{
		int left = 0;
		int right = s.length()-1;
		
		if(left == right)
			return true;
		
		char leftChar = s.charAt(left);		
		char rightChar = s.charAt(right);
		
		if(leftChar == rightChar)
		{
			if(left == (right - 1))
				return true;
			return palindrome(s.substring(1, s.length()-1));
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(palindrome("MADDAM"));
	}
}
