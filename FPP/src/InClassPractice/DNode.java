package InClassPractice;

public class DNode {
	int data;
	DNode pre;
	DNode next;
	
	DNode() {};

	public DNode(int data, DNode pre, DNode next) {
		this.data = data;
		this.pre = pre;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return data + " ";
	}

	public static void main(String[] args) {

		DNode n1 = new DNode();
		n1.data = 123;
		n1.next = null;
		n1.pre = null;
		System.out.println(n1);

		DNode n2 = new DNode();
		n2.data = 43;
		n2.pre = n1;
		n1.next = n2;
		n2.next = null;
		System.out.println(n2);

		DNode n11 = new DNode();
		n11.data = 30;
		n11.pre = n1;
		n11.next = n2;
		n2.pre = n11;
		n1.next = n11;
		System.out.println(n1.next);
		int sum = 0;
		for( DNode current = n1; current != null; current = current.next)
		{
			sum += current.data;
		}
		System.out.println(sum);
	}
}
