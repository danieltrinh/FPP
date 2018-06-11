package Lesson8Homework.Question2;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		if(p1.getLast().compareTo(p2.getLast()) !=0)
			return p1.getLast().compareTo(p2.getLast());
			else 
				if(p1.getFirst().compareTo(p2.getFirst()) !=0)
					return p1.getFirst().compareTo(p2.getFirst());
				else
					return Integer.compare(p1.getAge(), p2.getAge());	
	}
	
}
