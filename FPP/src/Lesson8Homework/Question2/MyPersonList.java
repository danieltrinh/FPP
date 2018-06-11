package Lesson8Homework.Question2;

import java.util.Arrays;

import lesson8.MyStringList;

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
		
		Person[] x = (Person[]) pers.clone();
		System.out.println(Arrays.toString(x));
		
	}
}
