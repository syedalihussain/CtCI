package TreesAndGraphs;

public class TreeNode {
	public String name;
	public TreeNode[] children;
	
	public TreeNode(String s){
		this.name = s;
	}
	
	public void visit(TreeNode node){
		System.out.println(name);
	}
}
