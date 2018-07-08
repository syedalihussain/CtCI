package TreesAndGraphs;

public class MinimalTree4_2 {

	public static TreeNode createMinimalBST(int array[]){
		return createMinimalBST(array, 0, array.length-1);
	}
	
	public static TreeNode createMinimalBST(int array[], int start, int end){
		
		if (start > end) return null;
		int mid = (start+end)/2;
		TreeNode newnode = new TreeNode(array[mid]);
		newnode.left = createMinimalBST(array, start, mid-1);
		newnode.right = createMinimalBST(array, mid+1, end);
		
		return newnode;
	}

	public static void main(String[] args) {
		
		int[] sortedArray = {1,2,3,4,5,6,7,8};
		TreeNode root = createMinimalBST(sortedArray);
		System.out.println(root.right.value);
	}

}
