package Lesson2Homework;

import java.util.Scanner;

public class Prog4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input String");
		String input = in.nextLine();
		for(int i = input.length()-1; i>=0; i--)
		{
			System.out.print(input.charAt(i));
		}
	}
}
