package arraysAndStrings;

import java.util.Collection;
import java.util.Collections;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefgh";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String newStr = sb.toString();
		System.out.println(newStr);
		
		char[] charArr = new char[str.length()];
		for (int i=0; i<str.length(); i++) {
			charArr[str.length()-1-i] = str.charAt(i);
		}
		String chrStr = new String(charArr);
		System.out.println(chrStr);
	}

}
