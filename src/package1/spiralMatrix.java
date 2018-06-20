package package1;

public class spiralMatrix {
	public static int[] traverse(int[][] matrix){
		int n = matrix[0].length;
		int m = matrix.length;
		int rn = n--;
		int rm = m--;
		int[] arr = new int[m*n];
		int c = 0, r = 0;
		boolean east = true, south = false, west = false, north = false;
		int index = 0;
		while (){
			for (int a=c; a<n; a++){
				arr[index++] = matrix[r][a];
			}
			for (int b=r; b<m; b++){
				arr[index++] = matrix[b][rn];
			}
			c++; r++;
			for (int a=rn; a>c; a--){
				arr[index++] = matrix[]
			}
		}
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
		System.out.println(matrix[1][3]);
		for (int i=0; i<res.length; i++){
			System.out.print(res[i] + " ");
		}
	}

}
