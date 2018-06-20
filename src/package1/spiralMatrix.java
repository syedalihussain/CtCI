package package1;

public class spiralMatrix {
	public static int[] traverse(int[][] m){
//		int numCols = 
//		for (int i=0; )
		int[] temp = new int[]{1, 2, 3, 4 };
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][]{
				{ 1, 2, 3, 4 },
				{ 4, 5, 6, 7 },
				{ 7, 8, 9, 8 }
			};
		int[] res = traverse(matrix);
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		for (int i=0; i<res.length; i++){
			System.out.print(res[i] + " ");
		}
	}

}
