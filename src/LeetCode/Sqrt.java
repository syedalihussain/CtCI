package LeetCode;

public class Sqrt {
	
	public static int mySqrt(int x) {
		long r = x;
		while (r*r > x) {
			r = (r + x/r) / 2;
		}
		return (int) r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(20));
	}

}
