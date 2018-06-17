package Lesson12Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("Input a number from range 1 - 100");
			try {
				
				Scanner s = new Scanner(System.in);
				int input = s.nextInt();
				if (input < 0)
					throw new IllegalArgumentException();
				else if (input > 100)
					throw new OverLimitException();
				
				System.out.println("Thank you, you inputted correctly, your number is " + input);
				break;

			} catch (InputMismatchException e) {
				System.out.println("Please input an integer");
			} catch (IllegalArgumentException e) {
				System.out.println("Please input an positive number");
			} catch (OverLimitException e) {
				System.out.println("Please input an integer smaller than 100");
			}
		}
	}
	
	public static class OverLimitException extends Exception{
		public OverLimitException () {
			super();
		};
		
		public OverLimitException(String msg) {
			super(msg);
		}
		
	}
}
