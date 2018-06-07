package Lesson7Homework.Question2;

public class Main {
	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		t.add('w',"Daniel");
		System.out.println(t);
		
		String s = t.get('b');
		System.out.println(s);
	}
}

/* OUTPUT 

a -> Andrew
b -> Billy
w -> Daniel

Billy

*/