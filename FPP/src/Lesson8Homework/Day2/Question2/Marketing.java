package Lesson8Homework.Day2.Question2;

public class Marketing {
	String employeeName;
	String productName;
	double salesAmount;
	
	public Marketing(String employeeName, String productName, double salesAmount) {
		this.employeeName = employeeName;
		this.productName = productName;
		this.salesAmount = salesAmount;
	}

	@Override
	public String toString() {
		return "employeeName=" + employeeName + ", productName=" + productName + ", salesAmount="
				+ salesAmount + "\n";
	}
	
	@Override
	public boolean equals(Object ob)
	{
		if(ob == null) return false;
		if(this == ob) return true;
		
		if(this.getClass() != ob.getClass())
			return false;
		
		Marketing m = (Marketing) ob;
		if(
			this.employeeName.equals(m.employeeName) &&
			this.productName.equals(m.productName) &&
			this.salesAmount == m.salesAmount
			)
			return true;
		return false;
	}
	
	@Override
	public int hashCode()
	{
		int hash = 13;
		int result = 1;
		result = result * hash + employeeName.hashCode() + productName.hashCode();
		long temp = Double.doubleToLongBits(salesAmount); 
		result = result * hash + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
}
