package Lesson8Homework.Day2.Question1;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addSort(String item) {
		// Implement
		if (header == null) {
			header = new Node(null, item, null);
		} else {
			// add before header if smaller than header
			if (header.value.compareTo(item) > 0) {
				Node n = new Node(null, item, header);
				header.previous = n;
				header = n;
				return;
			}

			// add before the bigger element
			Node temp = header;
			while (temp.next != null) {
				if (temp.value.compareTo(item) > 0) {
					Node n = new Node(temp.previous, item, temp);
					temp.previous.next = n;
					temp.previous = n;
					return;
				}
				temp = temp.next;
			}
			
			//add Last if there're no bigger element
			Node n = new Node(temp, item, null);
			temp.next = n;
			return;
		}

	} // insert in a Sorted Order

	 public int size() {
		 // Implement
		 Node n = header;
		 int size = 0;
		 
		 while(n != null)
		 {
			 size++;
			 n = n.next;
		 }
		 return size;
	 }
	 
	
	 public boolean isEmpty() {
		 if(header == null)
			 return true;
		 return false;
	 }
	
	 public Node getFirst() {
	 // Implement
		 return header;
	 }
	
	 public Node getLast() {
	 // Implement
		 if(header == null) return null;
		 
		 Node temp = header;
		 while(temp.next != null)
		 {
			 temp = temp.next;
		 }
		 return temp;
	 }
	
	 public boolean contains(String item) {
		 // Implement
		 Node n = header;
		 while(n.next != null)
		 {
			 if(n.value.equals(item))
				 return true;
			 n = n.next;
		 }
		 return false;
	 }
	
	 public void removeFirst() {
	 // Implement
		 header.next.previous = null;
		 header = header.next;
	 }
	
	 void removeLast() {
		 // Implement
		 Node n = header;
		 while(n.next != null)
		 {
			 n = n.next;
		 }
		 n.previous.next = null;
		 n=null;
	 }
	
	public void print() {
		print(header);
	}

	// Write a recursive print method to display the elements in the list.
	void print(Node n) {
		while (n.next != null) {
			System.out.println(n.toString());
			n = n.next;
		}
		System.out.println(n.toString());
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		// Make use of the implemented methods
		mySL.addSort("Leo");
		mySL.addSort("Myle");
		mySL.addSort("Arron");
		mySL.addSort("Ellie");
		mySL.addSort("Zing");
		mySL.print();
		System.out.println("------- Check Size -------");
		System.out.println(mySL.size());
		
		System.out.println("------- Get First and Last-------");
		System.out.println(mySL.getFirst());
		System.out.println(mySL.getLast());
		
		System.out.println("------- if Contains \"Myle\"-------");
		System.out.println(mySL.contains("Myle"));

		System.out.println("------- remove First-------");
		mySL.removeFirst();
		mySL.print();
		
		System.out.println("------- remove Last-------");
		mySL.removeLast();
		mySL.print();
		
	}

}

/*
Arron
Ellie
Leo
Myle
Zing
------- Check Size -------
5
------- Get First and Last-------
Arron
Zing
------- if Contains "Myle"-------
true
------- remove First-------
Ellie
Leo
Myle
Zing
------- remove Last-------
Ellie
Leo
Myle


*/
