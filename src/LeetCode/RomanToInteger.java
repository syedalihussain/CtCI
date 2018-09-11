package LeetCode;

import java.util.HashMap;


public class RomanToInteger {
	
	public static int romanToInt(String s) {
		
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("I", 1);
		hashmap.put("V", 5);
		hashmap.put("X", 10);
		hashmap.put("L", 50);
		hashmap.put("C", 100);
		hashmap.put("D", 500);
		hashmap.put("M", 1000);
		hashmap.put("IV", 4);
		hashmap.put("IX", 9);
		hashmap.put("XL", 40);
		hashmap.put("XC", 90);
		hashmap.put("CD", 400);
		hashmap.put("CM", 900);
		int i = 0;
		int sum = 0;
		while (i<=s.length()-1) {
			String sm = "", l = "";
			if (i < s.length()-1) {
				l = Character.toString(s.charAt(i)) + Character.toString(s.charAt(i+1));
				sm = Character.toString(s.charAt(i));
			} else {
				sm = Character.toString(s.charAt(i));
			}
//			System.out.println("Larger is : " + l);
//			System.out.println("Smaller is: " + sm);
			if (hashmap.containsKey(l)) {
				sum += hashmap.get(l);
				i++;
				i++;
			} else {
				sum += hashmap.get(sm);
				i++;
			}
//			System.out.println(sm);
			
		}
		
		return sum;
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "LVIII";
//		str = "XCV";
		System.out.println(romanToInt(str));
//		System.out.println(str);
	}

}
