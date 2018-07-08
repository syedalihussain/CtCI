package TreesAndGraphs;

public class Q4_6_Successor {
	
	public static TreeNode inOrderSuccessor(TreeNode node){
		if (node == null) return null;
		
		if (node.right!=null){
			return leftMostChild(node.right);
		} else {
			TreeNode q = node;
			TreeNode x = q.parent;
			while (x != null && x.right == q){
				q = x;
				x = q.parent;
			}
			return x;
		}
	}
	
	public static TreeNode leftMostChild(TreeNode node){
		while (node.left!=null){
			node = node.left;
		}
		return node;
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = MinimalTree4_2.createMinimalBST(array);
	}

}
