package arraysAndStrings;

public class Fibbonaci {
	
	private static int findNthFib(int n) {
		
		if (n == 1)
			return 0;
		else if (n == 2)
			return 1;
		
		int n1 = 0, n2 = 1;
		int res = 0;
		for (int i=2; i<n; i++) {
			res = n1 + n2;
			n2 = res;
			n1 = n2;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNthFib(4));

	}

}
