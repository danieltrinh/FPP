package Lesson11Homework.Prob3;

/** NOTE: You must override equals in this class */
public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}	
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj.getClass() != this.getClass()) return false;
		if(obj == this) return true;
		
		Employee e = (Employee) obj;
		
		if(this.getName().equals(e.getName()) 
				&& this.getSalary() == e.getSalary()
				)
			return true;
		
		return false;
	}
}
