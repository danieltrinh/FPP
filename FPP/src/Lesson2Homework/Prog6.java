package Lesson2Homework;

import java.util.Arrays;

public class Prog6 {
	public static void main(String[] args) {
		String[] input = new String[] {"cat", "dog", "horse" , "horse","dog", "cat", "bird","horse"};
		int uniqueSize = input.length;
		System.out.println(Arrays.toString(input));
		
		for(int i = 0; i < uniqueSize; i++)
		{
			for(int j = i+1; j < uniqueSize; j++)
			{
//				System.out.println("i:"+ i + " " +input[i] + " - " + input[j] +" j:"+ j + " " );
				if(input[i].equals(input[j]))
				{
					input[j] = input[uniqueSize-1];
					uniqueSize--;
					// to make sure the switched last element does not have the same value as input[i]
					j--;
				}
			}
//			System.out.println("___end j___ size="+ uniqueSize);
		}
		
		String[] output = Arrays.copyOf(input, uniqueSize);
		System.out.println(Arrays.toString(output));
	}
}
