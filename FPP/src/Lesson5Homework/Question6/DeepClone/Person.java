package Lesson5Homework.Question6.DeepClone;

public class Person implements Cloneable{
	String name;
	Computer computer;
	
	public Person(String name, Computer computer) {
		this.name = name;
		this.computer = computer;
	}
	
	@Override
	public String toString()
	{
		return name+ "'s computer \n" + computer.toString();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.computer = (Computer) this.computer.clone();
		return p;
	}
}
