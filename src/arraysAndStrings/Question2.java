package arraysAndStrings;

public class Question2 {
	
	private static String reverse(String s) {
		
		char[] charArr = new char[s.length()];
		for (int i=0; i<s.length(); i++) {
			charArr[i] = s.charAt(s.length()-1-i);
		}
		
		
		return new String(charArr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		System.out.println(reverse(str));
	}

}
