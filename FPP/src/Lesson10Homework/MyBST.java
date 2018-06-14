package Lesson10Homework;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import javafx.scene.Node;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(BinaryNode t) {
		// implement
		if (t != null) {
			System.out.print(t.element + ",");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(BinaryNode t) {
		if (t != null) {
			postOrder(t.left);
			postOrder(t.right);
			System.out.print(t.element + ",");
		}
	}

	public boolean contains(Integer key) {
		if (root != null) {
			BinaryNode n = root;
			while (true) {
				if (key.compareTo(n.element) == 0) {
					return true;
				} else if (key.compareTo(n.element) < 0) {
					if (n.left == null)
						return false;
					n = n.left;
				} else {
					if (n.right == null)
						return false;
					n = n.right;
				}
			}
		}
		return false;
	}

	public Integer getRoot() {
		// implement
		if (root == null) {
			System.out.println("Empty Tree");
			return -1;
		}

		return root.element;
	}

	public Integer leafNodes() {
		return leafNodes(root);
	}

	private int leafNodes(BinaryNode t) {
		// Implement
		if(t==null) return 0;
		if(t.left == null && t.right == null)
			return 1;
		return leafNodes(t.left) + leafNodes(t.right);
	}
	
	public int size() {
		return getSize(root);
	}
	
	private int getSize(BinaryNode n)
	{
		if(n == null) 
			return 0;
		return 1 + getSize(n.left) + getSize(n.right);
	}

	public Integer findMin() {
		return findMin(root);
	}

	private Integer findMin(BinaryNode n) {
		// implement
		while(n.left != null)
			n = n.left;
		return n.element;
	}
	
	public Integer findMax() {
		return findMax(root);
	}

	private Integer findMax(BinaryNode n) {
		// implement
		while(n.right != null)
			n = n.right;
		return n.element;
	}

	public boolean isEmpty() {
		// implement
		if (root == null)
			return true;
		return false;
	}

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

	}

	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);
		}
		mybst.insert(12);
		System.out.println("In-order:");
		mybst.printTree();

		System.out.println("\nPre-order:");
		mybst.preOrder();

		System.out.println("\nPost-order:");
		mybst.postOrder();

		System.out.println("\nIf contains 22:");
		System.out.println(mybst.contains(22));

		System.out.println("\nIf contains 23:");
		System.out.println(mybst.contains(23));

		System.out.println("\nRoot");
		System.out.println(mybst.getRoot());
		
		System.out.println("\nMin Node");
		System.out.println(mybst.findMin());
		
		System.out.println("\nMax Node");
		System.out.println(mybst.findMax());
		
		System.out.println("\nNumber Of LeafNodes");
		System.out.println(mybst.leafNodes());
		
		System.out.println("\nTree Size");
		System.out.println(mybst.size());

		// System.out.println("\n\n-----TreeSet Example:");
		// TreeSet<Integer> ts = new TreeSet<Integer>();
		//
		// for (int j = 0; j < a.length; j++) {
		// ts.add(a[j]);
		// System.out.println("\nAfter inserting " + j + "th item " + a[j]);
		// Iterator<Integer> it = ts.iterator();
		// Integer nextItem = null;
		// while (it.hasNext()) {
		// nextItem = it.next();
		// System.out.print(nextItem + " ");
		// }
		// System.out.println();
		// }
		//
		// System.out.println("\n\n-----TreeMap Example:");
		// TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		// map.put(8, "Hello");
		// map.put(10, "World!");
		// map.put(11, "Welcome");
		// map.remove(8);
		// String str = map.get(11) + ", " + map.get(10);
		// System.out.println(str);

	}
}

/*
In-order:
1,2,3,9,12,15,16,19,22,25,56,100,
Pre-order:
15,12,9,1,3,2,56,16,19,22,25,100,
Post-order:
2,3,1,9,12,25,22,19,16,100,56,15,
If contains 22:
true

If contains 23:
false

Root
15

Min Node
1

Max Node
100

Number Of LeafNodes
3

Tree Size
12

*/
