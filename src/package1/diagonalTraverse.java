package package1;

public class diagonalTraverse {
	public static int[] traverse(int[][] matrix){
		if (matrix.length == 0) return new int[0];
        int numRows = matrix.length;
		int numCols = matrix[0].length;
		int rnum = 0, cnum = 0;
		int i=-1;
		boolean direction = true;
		int[] res = new int[numRows*numCols];
		while (i!=(numRows*numCols)-1){
			if (rnum>=0 && rnum<numRows && cnum>=0 && cnum<numCols){
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
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[0];
		System.out.println(a);
		System.out.println();
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
/*
 * if (matrix.length == 0) return new int[0];
        int r = 0, c = 0, m = matrix.length, n = matrix[0].length, arr[] = new int[m * n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = matrix[r][c];
            if ((r + c) % 2 == 0) { // moving up
                if      (c == n - 1) { r++; }
                else if (r == 0)     { c++; }
                else            { r--; c++; }
            } else {                // moving down
                if      (r == m - 1) { c++; }
                else if (c == 0)     { r++; }
                else            { r++; c--; }
            }   
        }   
        return arr;
*/
