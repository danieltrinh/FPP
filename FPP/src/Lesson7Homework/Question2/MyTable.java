package Lesson7Homework.Question2;

public class MyTable {
	private Entry[] entries;
	private char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	MyTable()
	{
		entries = new Entry[26];
	}

	// returns the String that is matched with char c in the table
	public String get(char c) {
		// implement
		int pos = getPosition(c);
		
		Entry e = entries[pos];
		
		if(e != null && e.str != null)
			return e.str;
		
		return "Item at '"+ c + "\' does not exist in the table";
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		// implement
		Entry e = new Entry(c, s);
		int pos = getPosition(c);
		entries[pos] = e;
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		// implement
		StringBuilder wholeTable = new StringBuilder();
		for (Entry entry : entries) {
			if(entry != null)
				wholeTable.append(entry.toString() + "\n");
		}
		return wholeTable.toString();
	}
	
	private int getPosition(char c)
	{
		for (int i=0; i< alphabet.length; i++) {
			if(alphabet[i] == c)
			{
				return i;
			}
		}
		return -1;
	}

	private class Entry {
		
		private char ch;
		private String str;
		
		Entry(char ch, String str) {
			// implement
			this.ch = ch;
			this.str = str;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			// implement
			return ch + " -> " + str;
		}
	}
}