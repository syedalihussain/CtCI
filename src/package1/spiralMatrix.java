package package1;
import java.util.*;
import java.util.stream.Collectors;
public class spiralMatrix {
	public static List<Integer> traverse(int[][] matrix){
//		if (matrix.length == 0){
//			return List<Integer>
//		}
		int n = matrix[0].length;
		int m = matrix.length;
		int rn = n-1;
		int rm = m-1;
//		System.out.println(n);
//		System.out.println(rn);
		int[] arr = new int[m*n];
		int c = 0, r = 0;
//		boolean east = true, south = false, west = false, north = false;
		int index = 0;
		while (index<arr.length){
			for (int a=c; a<=rn; a++){
				System.out.println("loop1: " + matrix[r][a]);
				arr[index++] = matrix[r][a];
			}
			if (index>=arr.length) break;
			r++;
			for (int b=r; b<=rm; b++){
				arr[index++] = matrix[b][rn];
				System.out.println("loop2: " + matrix[b][rn]);
			}
			if (index>=arr.length) break;
			rn--;
			for (int a=rn; a>=c; a--){
				arr[index++] = matrix[rm][a];
				System.out.println("loop3: " + matrix[rm][a]);
			}
			if (index>=arr.length) break;
			rm--;
			for (int b=rm; b>=r; b--){
				arr[index++] = matrix[b][c];
				System.out.println("loop4: " + matrix[b][c]);
			}
			if (index>=arr.length) break;
			c++;
		}
		List<Integer> res = Arrays.stream(arr).boxed().collect(Collectors.toList());
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][]{
				{ 1 },
				{ 4 },
				{ 7 }
			};
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
//		System.out.println(matrix[0][3]);
		List<Integer> list3 = traverse(matrix);
		
		System.out.println(list3);
	}

}
/*
 * public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        if (matrix.length == 0) {
            return res;
        }
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // Traverse Right
            for (int j = colBegin; j <= colEnd; j ++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            
            // Traverse Down
            for (int j = rowBegin; j <= rowEnd; j ++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int j = colEnd; j >= colBegin; j --) {
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd) {
                // Traver Up
                for (int j = rowEnd; j >= rowBegin; j --) {
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        
        return res;
    }
}
*/
