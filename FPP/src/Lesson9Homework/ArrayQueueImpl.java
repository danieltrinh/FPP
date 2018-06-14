package Lesson9Homework;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	private int size = 0;

	public int peek() {
		if(isEmpty())
		{
			System.out.println("Queue is Empty, No Peeking");
			return -1;
		}
		int result = arr[front];
		return result;
	}

	public void enqueue(int obj) {
		// implement
		
		if(front + size + 1 > arr.length)
			resize();
		
		if(front == -1)
		{
			arr[++front] = obj;
			size++;
		}
		else
		{
			arr[++rear]=obj;
			size++;
		}
	}

	public int dequeue() {
		// implement
		if(isEmpty())
		{
			System.out.println("Queue is Empty, No Dequeueing");
			return -1;
		}
		int result = arr[front++];
		size--;
		return result;
	}

	public boolean isEmpty() {
		// implement
		if(size <= 0)
			return true;
		return false;
	}

	public int size() {
		// implement
		return size;
	}
	
	private void resize() {
		// implement
		int currentSize = arr.length;
		int newSize = currentSize * 2;
		int [] newArray = new int[newSize];
		
		System.out.println("Resizing from size "+currentSize + " to " + newSize);
		System.arraycopy(arr, 0, newArray, 0, currentSize);
		arr = newArray;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(int i = front; i <= rear; i++)
		{
			s.append(arr[i] + ", ");
		}
		return s.toString();
	}
	
	public static void main(String[] args) {
		ArrayQueueImpl qs = new ArrayQueueImpl();
		
		System.out.println("Dequeing empty:");
		System.out.println(qs.dequeue());
		System.out.println("Peeking empty:");
		System.out.println(qs.peek());
		
		qs.enqueue(10);
		qs.enqueue(20);
		qs.enqueue(30);
		qs.enqueue(40);
		qs.enqueue(50);
		qs.enqueue(360);
		qs.enqueue(30);
		qs.enqueue(60);
		qs.enqueue(70);
		qs.enqueue(70);
		qs.enqueue(70);
		
		System.out.println("After enqueing: ");
		System.out.println(qs);
		
		System.out.println("Front: " + qs.front);
		System.out.println("Rear: " + qs.rear);
		System.out.println("Size: " + qs.size());
		
		System.out.println("Deque 4 values: ");
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());
		System.out.println(qs.dequeue());
		System.out.println("After Dequeing 4 values: ");
		System.out.println(qs);
		System.out.println("Size: " + qs.size());
		System.out.println("Peeking first: ");
		System.out.println(qs.peek());
		System.out.println("After Peeking first: ");
		System.out.println(qs);
		
		qs.enqueue(10);
		qs.enqueue(20);
		qs.enqueue(30);
		qs.enqueue(40);
		qs.enqueue(50);
		qs.enqueue(360);
		qs.enqueue(30);
		qs.enqueue(60);
		qs.enqueue(70);
		qs.enqueue(70);
		qs.enqueue(70);
		
		System.out.println("After Enqueing more than original size");
		System.out.println(qs);
		System.out.println("Front: " + qs.front);
		System.out.println("Rear: " + qs.rear);
		System.out.println("Size: " + qs.size());
		
		
	}
}


/*
Dequeing empty:
Queue is Empty, No Dequeueing
-1
Peeking empty:
Queue is Empty, No Peeking
-1
Resizing from size 10 to 20
After enqueing: 
10, 20, 30, 40, 50, 360, 30, 60, 70, 70, 70, 
Front: 0
Rear: 10
Size: 11
Deque 4 values: 
10
20
30
40
After Dequeing 4 values: 
50, 360, 30, 60, 70, 70, 70, 
Size: 7
Peeking first: 
50
After Peeking first: 
50, 360, 30, 60, 70, 70, 70, 
Resizing from size 20 to 40
After Enqueing more than original size
50, 360, 30, 60, 70, 70, 70, 10, 20, 30, 40, 50, 360, 30, 60, 70, 70, 70, 
Front: 4
Rear: 21
Size: 18

 */



