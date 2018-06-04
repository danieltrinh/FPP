package Lesson2Homework;

public class Prog8 {
	public static void main(String[] args) {
		int[] nums = new int[] {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
		int min = nums[0];
		for(int i = 0 ; i < nums.length; i++)
		{
			if(nums[i] < min)
				min = nums[i];
		}
		System.out.println(min);
	}
}
