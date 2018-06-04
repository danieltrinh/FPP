package Lesson4Homework;

public class Question3 {
	
	private static int binarySearch(int[] objs, int search, int leftBoundIndex, int rightBoundIndex)
	{
		int mid = (rightBoundIndex + leftBoundIndex) / 2;
		if (mid == leftBoundIndex || mid == rightBoundIndex)
		{
			if(objs[leftBoundIndex] == search)
				return leftBoundIndex;
			else if(objs[rightBoundIndex] == search)
				return rightBoundIndex;
			else
				return -1;
		}
		
		if(search > objs[mid])
		{
			leftBoundIndex = mid + 1;
			return binarySearch(objs, search, leftBoundIndex, rightBoundIndex);
		}
		else if(search < objs[mid])
		{
			rightBoundIndex = mid - 1;
			return binarySearch(objs, search, leftBoundIndex, rightBoundIndex); 
		}
		else
		{
			return mid;
		}
	}
	
	public static int binarySearch(int[] objs, int search)
	{
		return binarySearch(objs, search, 0, objs.length-1);
	}
	
	public static void main(String[] args) {
		int[] c1 = new int[] {1,2,5,6,8,9};
		System.out.println(binarySearch(c1, 2));

	}
}

//OUTPUT
// 1