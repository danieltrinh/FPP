package Lesson12Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

class OverLimitException extends Exception {
	public OverLimitException () {
		super();
	};
	
	public OverLimitException(String msg) {
		super(msg);
	}
}

public class Question1 {
	public static void main(String[] args) {
		while (true) {
			System.out.println("Input a number from range 1 - 100");
			try {
				
				Scanner s = new Scanner(System.in);
				int input = s.nextInt();
				if (input < 0)
					throw new IllegalArgumentException("Please input an positive number");
				else if (input > 100)
				{
					throw new OverLimitException("Please input an integer smaller than 100");
				}
				else
				{
					System.out.println("Thank you, you inputted correctly, your number is " + input);
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Please input an integer");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			} catch (OverLimitException e) {
				System.out.println(e.getMessage());
			} catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
	
}

/* OUTPUT
Input a number from range 1 - 100
abc
Please input an integer
Input a number from range 1 - 100
-231
Please input an positive number
Input a number from range 1 - 100
234124
Please input an integer smaller than 100
Input a number from range 1 - 100
20
Thank you, you inputted correctly, your number is 20
*/