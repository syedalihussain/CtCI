package LeetCode;

public class climbingStairs {
	
	public static int lengthOfLastWord(String s) {
		if (s.length() == 0)
			return 0;
		String str = s.trim();
		if (str.length() == 0)
			return 0;
		int end = str.lastIndexOf(' ');
		return str.length() - end - 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		System.out.println(lengthOfLastWord(str));
	}

}
