package LinkedLists;
import java.util.*;
public class kthtoLast {
	public static int kthtolast(LinkedList<Integer> llist, int k){
		Iterator<Integer> itr = llist.descendingIterator();
		int val = 0;
		for (int i=0; i<k; i++) {
			val = itr.next();
		}
		return val;
	}
	public static int printKthToLast(Node head, int k){
		if (head == null) return 1;
		int data = printKthToLast(head.next, k);
		int count = data;
		count++;
//		System.out.println(count);
		if ((count - k) == 0) 
			{return head.data;}
		else if (count-k>0) return data;
		else return count;
	}
	public static int printKthToLastIter(Node head, int k){
		Node leadPointer = head;
		Node lagPointer = head;
		int count = 0;
		while(leadPointer!=null){
			if(count-k > 0) lagPointer = lagPointer.next;
			leadPointer = leadPointer.next;
			count++;
		}
		return lagPointer.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for (int i=0; i<10; i++) {
			ll.add(i);
		}
		int val = kthtolast(ll, 1);
		System.out.println(val);
		SingleLinkedList sll = new SingleLinkedList();
		for (int i=0; i<10; i++) {
			sll.append(i);
		}
		System.out.println(printKthToLastIter(sll.head, 0));
	}

}
