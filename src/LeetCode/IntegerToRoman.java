package LeetCode;

public class IntegerToRoman {
	
	public static String convert(int num) {
		String res = "M";
		int times;
		StringBuilder sb = new StringBuilder();
		
		
		times = num/1000;
		if (times >= 1){
			sb.append(repeat(res, times));
		}
		int hundreth = num%1000/100;
		sb.append(toRoman(hundreth, "C", "D", "M"));
		int tength = num%100/10;
		sb.append(toRoman(tength, "X", "L", "C"));
		int unit = num%10;
		sb.append(toRoman(unit, "I", "V", "X"));
		
		System.out.println(sb.toString());
		return res;
	}
	
	public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
	
	public static String toRoman(int digit, String first, String sec, String third) {
		String res = null;
		if (digit <= 5){
			if (digit <= 3) {
				res = repeat(first, digit);
			} else if (digit == 4) {
				res = first + sec;
			} else {
				res = sec;
			}
		} else {
			if (digit == 6) {
				res = sec + first ;
			} else if (digit == 7) {
				res = sec + first + first;
			} else if (digit == 8) {
				res = sec + first + first + first;
			} else if (digit == 9) {
				res = first + third;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert(1994));
	}
	
	

}
