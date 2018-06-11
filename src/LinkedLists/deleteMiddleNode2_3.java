package LinkedLists;

public class deleteMiddleNode2_3 {
	public static boolean deleteMiddleNode(Node node){
		if (node == null || node.next == null)
			return false;
		Node next = node.next;
		node.data = next.data;
		node.next = next.next;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sll = new SingleLinkedList();
		for (int i=0; i<10; i++) {
			sll.append(i);
		}
		Node middle = sll.head;
		for (int j=0; j<5; j++) {
			middle = middle.next;
		}
//		System.out.println(middle.data);
//		System.out.println(middle.next.data);
		deleteMiddleNode(middle);
		Node test = sll.head;
		while (test != null){
			System.out.print(test.data + " ");
			test = test.next;
		}
		System.out.println();
	}

}
