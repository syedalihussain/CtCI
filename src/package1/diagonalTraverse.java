package package1;

public class diagonalTraverse {
	public static int[] traverse(int[][] matrix){
		System.out.println(matrix.length);
		int numRows = matrix.length;
		int numCols = matrix[0].length;
		int rnum = 0, cnum = 0;
		int i=-1;
		boolean direction = true;
		int[] res = new int[numRows*numCols];
		while (i!=(numRows*numCols)-1){
//			System.out.println(matrix[rnum][cnum]);
			if (rnum>=0 && rnum<numRows && cnum>=0 && cnum<numCols){
				System.out.println("rnum: " + rnum + ", cnum: " + cnum);
				System.out.println(matrix[rnum][cnum]);
				res[++i] = matrix[rnum][cnum];
			}
			if (direction){
				rnum--;
				cnum++;
			} else {
				rnum++;
				cnum--;
			}
			if (rnum==-1 || cnum==numCols){
				if (cnum<numCols){
					rnum++;
				} else {
					rnum+=2;
					cnum--;
				}
				direction = !direction;
			} else if (cnum==-1 || rnum==numRows){
				if (rnum<numRows){
					cnum++;
				} else {
					cnum+=2;
					rnum--;
				}
				direction = !direction;
			}
		}
		int[] temp = new int[]{0};
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][]{
			  				{ 1, 2, 3, 4 },
			  				{ 4, 5, 6, 7 },
			  				{ 7, 8, 9, 8 }
							};
		int[] res = traverse(matrix);
		for (int i=0; i<res.length; i++){
			System.out.print(res[i] + " ");
		}
	}

}
