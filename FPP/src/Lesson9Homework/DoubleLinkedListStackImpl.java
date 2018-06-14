package Lesson9Homework;

public class DoubleLinkedListStackImpl {
	class Node {
		Object data;
		Node prev, next;

		public Node(Node prev, Object data, Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}

	Node top;
	int size;

	public void push(Object o) {
		if (isEmpty()) {
			top = new Node(null, o, null);
		} else {
			top.next = new Node(top, o, null);
			top = top.next;
		}
		size++;
	}

	public Object pop() {
		if (isEmpty())
			return null;

		
		Object data = top.data;
		
		if(top.prev == null)
		{
			System.out.println("Pop last");
			top = null;
		}
		else
		{
			top.prev.next = null;
			top = top.prev;
		}
		size--;
		return data;
	}

	public Object peek() {
		return top.data;
	}

	public boolean isEmpty() {
		if (top == null)
		{
			System.out.println("Empty Stack");
			return true;
		}
			
		return false;
	}

	public int size() {
		return size;
	}

	@Override
	public String toString() {
		if (isEmpty()) return null;
		StringBuilder sb = new StringBuilder();
		Node temp = top;
		System.out.println("Size " + size());
		while (temp != null) {
			if(temp == top)
				sb.append("[" +temp.toString() + "]-");
			else
				sb.append(temp.toString() + "-");
			temp = temp.prev;
		}
		sb.setLength(sb.length()-1);
		return sb.toString();
	}

	public static void main(String[] args) {
		DoubleLinkedListStackImpl ds = new DoubleLinkedListStackImpl();
		ds.push("First");
		ds.push("Second");
		ds.push("Third");
		ds.push("Forth");
		ds.push("Fifth");
		ds.push("Sixth");

		System.out.println("---After Push:");
		System.out.println(ds);

		System.out.println("Pop " + ds.pop());
		System.out.println("Pop " + ds.pop());
		System.out.println("Pop " + ds.pop());
		
		System.out.println("Peek: " + ds.pop());
		
		System.out.println("---After Pop:");
		System.out.println(ds);
	}
}

/* OUTPUT

Empty Stack
---After Push:
Size 6
[Sixth]-Fifth-Forth-Third-Second-First
Pop Sixth
Pop Fifth
Pop Forth
Peek: Third
---After Pop:
Size 2
[Second]-First

*/
