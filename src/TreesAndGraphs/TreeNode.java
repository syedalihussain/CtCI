package TreesAndGraphs;

public class TreeNode {
	int value;
	TreeNode left, right;
	
	public TreeNode(int value){
		this.value = value;
		left = right = null;
	}
	
	public void visit(){
		System.out.println(value);
	}
}
