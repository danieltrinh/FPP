package Homework2.Q2;

import java.text.DateFormat;
import java.util.Date;

public class Util {
	public static String dateAsString(Date d) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(d);
	}
	
}
