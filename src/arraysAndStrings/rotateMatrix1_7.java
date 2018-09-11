package arraysAndStrings;

public class rotateMatrix1_7 {
	public static boolean rotateMatrix(int[][] matrix){
		if (matrix.length==0 || matrix.length!=matrix[0].length) return false;
		int n = matrix.length;
		for (int layer=0; layer<n/2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i=first; i<last; i++) {
				int offset = i - first;
				int top = matrix[first][i];
				
				//	left -> top
				matrix[first][i] = matrix[last-offset][first];
				
				//	bottom -> left
				matrix[last-offset][first] = matrix[last][last-offset];
				
				//	right -> bottom
				matrix[last][last-offset] = matrix[i][last];
				
				//	top -> right
				matrix[i][last] = top; // right <- saved top
			}
		}
			
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multi = new int[][]{
			  { 1, 2, 3 },
			  { 4, 5, 6 },
			  { 7, 8, 9 }
			};
		rotateMatrix(multi);
		for (int i=0; i<multi.length; i++){
			for (int j=0; j<multi[i].length; j++){
				System.out.print(multi[i][j] + " ");
			}
			System.out.println();
		}
	}

}
