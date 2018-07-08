package TreesAndGraphs;

public class Q4_4_CheckBalanced {
	public static boolean isBalanaced(TreeNode root){
		return getHeight(root) != Integer.MIN_VALUE;
	}
	
	public static int getHeight(TreeNode root){
		if (root == null) return -1;
		
		int rightHeight = getHeight(root.right);
		if (rightHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
		
		int leftHeight = getHeight(root.left);
		if (leftHeight == Integer.MIN_VALUE) return Integer.MIN_VALUE;
		
		if (Math.abs(rightHeight - leftHeight) > 1)
			return Integer.MIN_VALUE;
		else
			return Math.max(rightHeight, leftHeight) + 1;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.insert(5);
		root.insert(15);
		root.insert(4);
		root.insert(6);
		root.insert(12);
		root.insert(16);
		root.insert(17);
		System.out.println(isBalanaced(root));
	}

}
