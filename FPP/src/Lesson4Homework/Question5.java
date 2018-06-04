package Lesson4Homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question5 {

	@Test
	// Test Question 1
	void test() {
		Question1 q1 = new Question1();
		q1.mergeTwoSorted("aelmo", "cdeft");
		String ao = q1.res.toString(); 
		String eo = "acdeeflmot";
		assertEquals(ao,eo);
	}
	
	@Test
	// Test Question 3
	void test2() {
		int[] a = new int[] {1,2,2,3,4,7,9,20,33};
		int ao = Question3.binarySearch(a, 3);
		int eo = 3;
		assertEquals(ao, eo);
	}
}
