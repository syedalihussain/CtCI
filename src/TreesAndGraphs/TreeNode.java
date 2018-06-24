package TreesAndGraphs;
enum State {Unvisited, Visited, Visiting;}
public class TreeNode {
	int value;
	TreeNode left, right;
	State state;
	public TreeNode(int value){
		this.value = value;
		left = right = null;
		state = State.Unvisited;
	}
	
	public void visit(){
		System.out.print(value + "-> ");
	}
	
	public void insert(int data){
		if (data <= value) {
			if (left == null){
				left = new TreeNode(data);
			} else {
				left.insert(data);
			}
		} else {
			if (right == null){
				right = new TreeNode(data);
			} else {
				right.insert(data);
			}
		}
	}
	
	public boolean find(int data){
		if (data == value) return true;
		else if (data < value) {
			if (left == null) return false;
			else {
				return left.find(data);
			}
		} else {
			if (right == null) return false;
			else {
				return right.find(data);
			}
		}
	}
}
