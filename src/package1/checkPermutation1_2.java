package package1;
import java.util.*;
public class checkPermutation1_2 {
	public static boolean checkPermutation(String s1, String s2){
		if (s1.length() != s2.length())
			return false;
		char s1_temp[] = s1.toCharArray();
		Arrays.sort(s1_temp);
		String s1_sorted = new String(s1_temp);
		char s2_temp[] = s2.toCharArray();
		Arrays.sort(s2_temp);
		String s2_sorted = new String(s2_temp);
		return s1_sorted.equals(s2_sorted);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcd";
		String str2 = "dabc";
		System.out.println(checkPermutation(str1, str2));
		int[] letters = new int[128];
		System.out.println(letters[0]);
	}

}
