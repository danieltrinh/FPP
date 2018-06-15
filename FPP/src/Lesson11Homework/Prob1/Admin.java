package Lesson11Homework.Prob1;
import java.util.*;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key,Student> result = new HashMap<>();
		
		//iterator method
		Iterator<Student> it = students.iterator();
		Student temp = null;
		while(it.hasNext())
		{
			temp = it.next();
			result.put(new Key(temp.getFirstName(), temp.getLastName()), temp);
		}
		
		//foreach method
//		for(Student s : students)
//		{
//			result.put(new Key(s.getFirstName(), s.getLastName()), s);
//		}
		
		return result;
	}
}
