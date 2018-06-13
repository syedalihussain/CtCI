package LinkedLists;

public class intersection2_7 {
//	public static 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sll2 = new SingleLinkedList();
		sll2.append(7);
		sll2.append(1);
		sll2.append(6);
		SingleLinkedList sll1 = new SingleLinkedList();
		sll1.head = sll2.head;
		sll2.append(9);
		sll2.append(9);
		sll1.append(8);
		sll1.append(8);
		Node n1 = sll1.head;
		while (n1!=null){
			System.out.print(n1.data + "->");
			n1 = n1.next;
		}
		System.out.println();
		Node n2 = sll2.head;
		while (n2!=null){
			System.out.print(n2.data + "->");
			n2 = n2.next;
		}
		System.out.println();
	}

}
