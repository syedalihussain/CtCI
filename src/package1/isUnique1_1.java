package package1;
import java.util.*;
public class isUnique1_1 {
	public static boolean isUnique(String str){
		Map<String, Integer> table = new HashMap<>();
		for (int i=0; i<str.length(); i++){
			String s = str.substring(i, i+1);
			if (table.containsKey(s)){
				return false;
			}
			table.put(s, 1);
		}
		return true;
	}
	public static boolean isUniqueChars(String str){
		int checker = 0;
		for (int i=0; i<str.length(); i++){
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0)
				return false;
			checker |= val;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		if (isUnique(str))
			System.out.println("Is Unique");
		else
			System.out.println("Not Unique");
		if (isUnique(str))
			System.out.println("Is Unique");
		else
			System.out.println("Not Unique");

	}
}
