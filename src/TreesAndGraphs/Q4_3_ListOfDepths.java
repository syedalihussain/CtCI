package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q4_3_ListOfDepths {
	
	//	This method uses a preorder traversal method
	public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		createLevelLinkedList(root, lists, 0);
		return lists;
	}

	public static void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){
		//	Base case
		if (root == null) return;
		
		LinkedList<TreeNode> list = null;
		
		if (lists.size() == level){
			/*
			 * This is the first time we are adding an element of a new depth.
			 * Therefore, we will create a new list and add this to the lists.
			 */
			list = new LinkedList<TreeNode>();
			lists.add(list);
		} else {
			list = lists.get(level);
		}
		
		list.add(root);
		createLevelLinkedList(root.left, lists, level+1);
		createLevelLinkedList(root.right, lists, level+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		root.insert(5);
		root.insert(15);
		root.insert(4);
		root.insert(6);
		root.insert(12);
		root.insert(16);
		
		ArrayList<LinkedList<TreeNode>> listsOfDepths = createLevelLinkedList(root);
		LinkedList<TreeNode> list = listsOfDepths.get(2);
		for (TreeNode n : list){
			System.out.println(n.value);
		}
	}

}
