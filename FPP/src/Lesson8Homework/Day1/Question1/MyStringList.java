package Lesson8Homework.Day1.Question1;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		if (size == strArray.length)
			resize();
		strArray[size++] = s;
	}

	public String get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		for (String test : strArray) {
			if (test.equals(s))
				return true;
		}
		return false;
	}

	public void insert(String s, int pos) {
		if (pos > size)
			return;
		if (pos >= strArray.length || size + 1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length + 1];
		System.arraycopy(strArray, 0, temp, 0, pos);
		temp[pos] = s;

		System.arraycopy(strArray, pos, temp, pos + 1, strArray.length - pos);
		strArray = temp;
		++size;

	}

	public boolean remove(String s) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index, strArray.length - (index + 1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2 * len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray, 0, temp, 0, len);
		strArray = temp;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(strArray[i] + ", ");
		}
		sb.append(strArray[size - 1] + "]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	// MinSort methods - Start
	public void sort() {
		if (strArray == null || strArray.length <= 1)
			return;
		int minIndex = 0;
		for (int i = 0; i < this.size; i++) {
			swap(minPos(i), i);
		}
	}

	public void swap(int i, int j) {
		String temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;
	}

	public int minPos(int startIndex) {
		String min = strArray[startIndex];
		int minIndex = startIndex;
		for (int i = startIndex + 1; i < this.size; i++) {
			if (min.compareTo(strArray[i]) > 0) {
				min = strArray[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	// MinSort methods - End

	// Search - Start
	public boolean search(String val) {
		return recurse(0, size - 1, val);
	}

	private boolean recurse(int bot, int top, String val) {
		if (bot > top)
			return false;
		int mid = (bot + top) / 2;

		if (strArray[mid].compareTo(val) < 0)
			return recurse(mid + 1, top, val);
		else if (strArray[mid].compareTo(val) > 0)
			return recurse(bot, mid - 1, val);
		else
			return true;
	}
	// Search - End

	public void addValues(String[] vals) {
		for (String s : vals) {
			this.add(s);
		}
	}

	public static void main(String[] args) {

		MyStringList list = new MyStringList();

		list.addValues(new String[] { "big", "small", "tall", "short", "round", "square", "enormous", "tiny",
				"gargantuan", "lilliputian", "numberless", "none", "vast", "miniscule" });

		System.out.println("Before Min Sorting");
		System.out.println(list.toString());

		System.out.println("-----------");

		list.sort();
		System.out.println("After Min Sorting");
		System.out.println(list.toString());

		System.out.println("-----------");

		System.out.println("Search for \"number\"");
		System.out.println(list.search("number"));

		System.out.println("-----------");
		System.out.println("Search for \"tiny\"");
		System.out.println(list.search("tiny"));
	}

}

/* OUTPUT
resizing
resizing
Before Min Sorting
[big, small, tall, short, round, square, enormous, tiny, gargantuan, lilliputian, numberless, none, vast, miniscule]
-----------
After Min Sorting
[big, enormous, gargantuan, lilliputian, miniscule, none, numberless, round, short, small, square, tall, tiny, vast]
-----------
Search for "number"
false
-----------
Search for "tiny"
true
*/
