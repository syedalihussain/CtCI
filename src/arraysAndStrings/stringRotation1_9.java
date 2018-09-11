package arraysAndStrings;

public class stringRotation1_9 {
	public static boolean stringRotation(String s1, String s2){
		if (s1.length() != s2.length() || s1.length()==0) return false;
		
		String s1s1 = s1 + s1;
		return isSubstring(s2, s1s1);
	}
	public static boolean isSubstring(String s1, String s2){
		int len = s1.length();
		String sub;
		for (int i=0; i<s2.length(); i++){
			if ((i+len) <= s2.length())
				sub = s2.substring(i, i+len);
			else
				return false;
			if (sub.equals(s1)) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("waterbottle");
		String str2 = new String("erbottlewat");
		String str3 = new String("ott1");
		System.out.println(isSubstring(str3, str1));
		System.out.println(stringRotation(str1, str2));
	}

}
