package TreesAndGraphs;

public class Q4_5_CheckBST {

	public static boolean checkBST(TreeNode root){
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean checkBST(TreeNode root, int min, int max){
		if (root == null){
			return true;
		} else if (root.value<min || root.value>max){
			return false;
		} else if (!checkBST(root.left, min, root.value) || !checkBST(root.right, root.value, max)){
			return false;
		}
		return true;
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
		System.out.println(checkBST(root));
	}

}
