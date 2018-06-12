package LinkedLists;
import java.util.*;
public class isPalindrome2_6 {
	public static boolean isPalindrome(Node n){

		if (n==null || n.next==null) return true;
		Node leadPntr = n;
		Node lagPntr = n;
		boolean toggle = false;
		Stack<Integer> stack = new Stack<Integer>();
		while (leadPntr != null){
			if (toggle) {
				stack.push(lagPntr.data);
				lagPntr = lagPntr.next;
			}
			toggle = !toggle;
			leadPntr = leadPntr.next;
		}
		if (toggle) lagPntr = lagPntr.next;
		while (lagPntr!=null){
			int data = stack.pop();
			if (lagPntr.data != data) return false;
			lagPntr = lagPntr.next;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList ll = new SingleLinkedList();
		ll.append(0);
		ll.append(1);
		ll.append(2);
		ll.append(1);
		ll.append(0);
		System.out.println(isPalindrome(ll.head));
	}

}
