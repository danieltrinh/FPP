package InClassPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayListAPIDemo {
	public static void main(String[] args) {
		
		ArrayList<String> nList = new ArrayList(Arrays.asList("Love", "you", "and", "Love", "me")); 
		
		nList.add("Bet");
		nList.add("You");
		nList.add("Do");
		nList.add("Biatch");
		nList.add("Happy");
		nList.add("Together");
		
		nList.sort(Collections.reverseOrder());
		
		System.out.println(nList);
		
		ArrayList<Integer> myNumList = new ArrayList(Arrays.asList(1,2,4,6,3,4)); 
		
		myNumList.add(3, 23);
		
		Collections.sort(myNumList);
		
		System.out.println(myNumList);
		
	}
}
