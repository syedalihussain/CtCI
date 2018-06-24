package TreesAndGraphs;

public class BinaryTree {
	TreeNode root;
	
	public BinaryTree(int value) {
		// TODO Auto-generated constructor stub
		root = new TreeNode(value);
	}
	
	public BinaryTree(TreeNode node) {
		// TODO Auto-generated constructor stub
		this.root = node;
	}
	
	public void preOrderTraversal(TreeNode node) {
		if (node != null){
			node.visit();
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	public void inOrderTraversal(TreeNode node) {
		if (node != null){
			inOrderTraversal(node.left);
			node.visit();
			inOrderTraversal(node.right);
		}
	}
	
	public void postOrderTraversal(TreeNode node) {
		if (node != null){
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			node.visit();
		}
	}
}
