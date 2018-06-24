package TreesAndGraphs;

public class TreesAndGraphs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		TreeNode f = new TreeNode(6);
		TreeNode g = new TreeNode(7);
		a.left = b; a.right = c;
		b.left = d; b.right = e;
		c.left = f; c.right = g;
		
		BinaryTree binarytree = new BinaryTree(a);
		
		binarytree.preOrderTraversal(binarytree.root);
		System.out.println();
		binarytree.inOrderTraversal(binarytree.root);
		System.out.println();
		binarytree.postOrderTraversal(binarytree.root);
		System.out.println();
	}

}
