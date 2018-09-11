package Q5_01_Insertion;

public class Question {
	
	public static int updateBits(int n, int m, int i, int j) {
		int allOnes = ~0;
		int left = (allOnes << (j+1)); 
		int right = ((1 << i) - 1);
		int mask = left | right;
		
		int n_cleared = n & mask;
		int m_shifted = m << i;

		return n_cleared | m_shifted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 6;
		int i = 2;
		int clear = (-1 << (j+1));
		System.out.println(clear);
	}

}
