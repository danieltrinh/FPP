package Lesson8Homework.Question2;

import java.util.Arrays;

public class MyPersonList {
	private final int INITIAL_LENGTH = 4;
	private Person[] perArr;
	private int size;
	
	MyPersonList()
	{
		this.perArr = new Person[INITIAL_LENGTH];
		this.size = 0;
	}
	
	public void add(Person p)
	{
		if (size == perArr.length)
			resize();
		perArr[size++] = p;
	}
	
	public Person get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return perArr[i];
	}
	
	public boolean find(Person p)
	{
		for(Person person: perArr)
		{
			if(person.equals(p))
				return true;
		}
		return false;
	}
	
	public void insert(Person p, int pos) {
		if (pos < 0 || pos > size)
			return;
		if (pos == perArr.length || size + 1 > perArr.length) {
			resize();
		}
		Person[] temp = new Person[perArr.length + 1];
		for (int i = 0; i < pos; i++)
			temp[i] = perArr[i];
		temp[pos] = p;
		for (int i = pos + 1; i < perArr.length; i++)
			temp[i] = perArr[i - 1];
		perArr = temp;
		++size;
	}

	public boolean remove(Person p) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (perArr[i].equals(p)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		Person[] temp = new Person[perArr.length];
		System.arraycopy(perArr, 0, temp, 0, index);
		System.arraycopy(perArr, index + 1, temp, index, perArr.length - (index + 1));
		perArr = temp;
		--size;
		return true;
	}
	
	void resize()
	{
		int len = perArr.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(perArr, 0, temp, 0, len);
		perArr = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("{\n") ;
		for (int i = 0; i < size-1; ++i) {
			sb.append("    " + perArr[i] + ",\n");
		}
		sb.append("    " + perArr[size - 1] + "\n}");
		return sb.toString();
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}

	public Object clone() {
		Person[] temp = Arrays.copyOf(perArr, size);
		return temp;

	}
	
	// MinSort methods ( by Lastname) - Start
		public void sort() {
			if (perArr == null || perArr.length <= 1)
				return;
			int minIndex = 0;
			for (int i = 0; i < this.size; i++) {
				swap(minPos(i), i);
			}
		}

		public void swap(int i, int j) {
			Person temp = perArr[i];
			perArr[i] = perArr[j];
			perArr[j] = temp;
		}

		public int minPos(int startIndex) {
			Person min = perArr[startIndex];
			int minIndex = startIndex;
			PersonComparator pc = new PersonComparator();
			for (int i = startIndex + 1; i < this.size; i++) {
				if (pc.compare(min, perArr[i]) > 0) {
					min = perArr[i];
					minIndex = i;
				}
			}
			return minIndex;
		}
		// MinSort methods - End

		// Search - Start
		public boolean search(Person val) {
			return recurse(0, size - 1, val);
		}

		private boolean recurse(int bot, int top, Person val) {
			if (bot > top)
				return false;
			int mid = (bot + top) / 2;
			
			PersonComparator pc = new PersonComparator();
			if (pc.compare(perArr[mid], val) < 0)
				return recurse(mid + 1, top, val);
			else if (pc.compare(perArr[mid], val) > 0)
				return recurse(bot, mid - 1, val);
			else
				return true;
		}
		// Search - End
	
	public static void main(String[] args) {
		
		MyPersonList pers = new MyPersonList();
		pers.add(new Person("Trinh", "Daniel", 23));
		pers.add(new Person("Pratt", "Chris", 30));
		pers.add(new Person("Bob", "Dylan", 70));
		pers.add(new Person("Ailen", "Susan", 77));
		pers.insert(new Person("Star", "Lord", 20), 2);
		
		System.out.println(pers);
		
		pers.remove(new Person("Star", "Lord", 20));
		System.out.println("After Removing Star Lord");
		System.out.println(pers);
		
		System.out.println("The list of size " + pers.size() + " is " + pers);
		pers.insert(new Person("Richard", "Marx", 55), 3);
		System.out.println("The list of size " + pers.size() + " after inserting Richard into pos 3 is " + pers);
		
		pers.insert(new Person("Tonya", "Ahi",60), 3);
		System.out.println("The list of size " + pers.size() + " after inserting Tonya into pos 0 is " + pers);
		
		pers.sort();
		System.out.println("Person List after sort");
		System.out.println(pers);
		
		System.out.println("Search for \"Star Lord\"- 20");
		System.out.println(pers.search(new Person("Star", "Lord", 20)));

		System.out.println("Search for \"Bob Dylan\" - 70");
		System.out.println(pers.search(new Person("Bob", "Dylan", 70)));
		
		Person[] x = (Person[]) pers.clone();
		System.out.println(Arrays.toString(x));
		
	}
}
