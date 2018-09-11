package LeetCode;

public class ReverseStringII {
	
	public static String reverseStr(String s, int k) {
        int lead = k, lag = 0, rev = k-1;
        int len = s.length();
        char[] charArr = new char[s.length()];
        boolean reverse = false;
        
        while (lead < len) {
        	
        	if ((lead % k) == 0) {
        		reverse = !reverse;
        		rev = lead-1;
        	}
        	if (reverse) {
        		char temp = s.charAt(lag);
        		charArr[lag++] = s.charAt(rev);
        		charArr[rev--] = temp;
        	} else {
//        		lag++;
        		charArr[lag] = s.charAt(lag);
        		lag++;
        	}
        	lead++;
        	
        }
        

        return new String(charArr);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefg";
		System.out.println(reverseStr(str, 2));

	}

}
