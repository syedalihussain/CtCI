package LinkedLists;

import java.util.HashSet;
import java.util.Stack;

public class loopDetection2_8 {
	public static Node detectLoop(Node head){
		Node n = head;
		HashSet<Node> hashset = new HashSet<Node>();
		while(n!=null){
			if (hashset.contains(n)){
				return n;
			}
			hashset.add(n);
			n = n.next;
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = c;
		System.out.println(a);
		Node res = detectLoop(a);
		System.out.println(res);
		System.out.println(c);
	}

}
