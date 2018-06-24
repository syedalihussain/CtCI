package TreesAndGraphs;

public class RouteBetweenNodes4_1 {
	public static void bfsearch(TreeNode start){
		start.visit();
		start.state = State.Visited;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(5);
	}

}
