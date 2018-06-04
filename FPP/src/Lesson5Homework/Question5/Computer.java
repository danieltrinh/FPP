package Lesson5Homework.Question5;

public class Computer {
	
	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}
	
	public int getRamSize()
	{
		return ramSize;
	}
	
	public double getProcessorSpeed()
	{
		return processorSpeed;
	}
	
	public double computePower()
	{
		return ramSize * processorSpeed;
	}
	
	@Override
	public String toString()
	{
		return "Computer from manufacturer : " + manufacturer + "\n" +
				"Processor : " + processor + "\n" +
				"RAM Size : " + ramSize + "\n" +
				"Processor Speed : " + processorSpeed;
	}
	
	@Override
	public boolean equals(Object com)
	{
		// check null
		if(com == null) return false;
		// check class
		if(this.getClass() != com.getClass())
			return false;
		// check if equal
		Computer c = (Computer) com;
		
		if(
			this.processor.equals(c.processor) &&
			this.manufacturer.equals(c.manufacturer) &&
			this.ramSize == c.ramSize &&
			this.processorSpeed == c.processorSpeed
			)
			return true;
		return false;
	}
	
	@Override
	public int hashCode()
	{
		int hash = 13;
		hash = 11 * hash + processor.hashCode() + manufacturer.hashCode() + ramSize + (int)processorSpeed;
		return hash;
	}
	
	
	
}
