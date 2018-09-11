package LeetCode;

public class ReverseInteger {
	
	public static int reverse(int x) {
		boolean isNegative;
        if (x<0){
        	isNegative = true;
        	x = 0-x;
        }
        else {
        	isNegative = false;
        }
            
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        if (isNegative)
			sb.append('-');
        sb.reverse();
		
		try {
			return Integer.parseInt(sb.toString());
		}
		catch (Exception e) {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int a = 1534236469;
		sb.append(a);
		sb.append('-');
		System.out.println(reverse(a));

	}

}
