package LinkedLists;

public class sumLists2_5 {
	public static Node sumLists(Node node1, Node node2){
		Node pntr = node1;
		int num1=0, tenthplace=1;
		while (pntr!=null){
			num1 += pntr.data*tenthplace;
			tenthplace *= 10;
			pntr = pntr.next;
		}
		int num2=0;
		tenthplace=1;
		pntr = node2;
		while (pntr!=null){
			num2 += pntr.data*tenthplace;
			tenthplace *= 10;
			pntr = pntr.next;
		}
		System.out.println(num1);
		System.out.println(num2);
		Integer num3 = num1 + num2;
		String str = num3.toString();
		SingleLinkedList sll = new SingleLinkedList();
		for (int i=0; i<str.length(); i++){
			int digit = str.charAt(i) - '0';
			sll.append(digit);
		}
		return sll.head;
	}
	public static Node addLists(Node node1, Node node2, int c){
		if (node1 == null && node2 == null) {
			return (c == 1) ? new Node(1) : null;
		}
		int d1 = (node1 == null) ? 0 : node1.data;
		int d2 = (node2 == null) ? 0 : node2.data;
		int sum = d1 + d2 + c;
		int unit = sum%10;
		int carry = (sum>=10) ? 1 : 0;
		Node node = new Node(unit);
		if (node1.next == null && node2.next == null)
			node.next = addLists(null, null, carry);
		else if (node1.next == null)
			node.next = addLists(null, node2.next, carry);
		else if (node2.next == null)
			node.next = addLists(node1.next, null, carry);
		else
			node.next = addLists(node1.next, node2.next, carry);
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList num1 = new SingleLinkedList();
		num1.append(7);
		num1.append(1);
		num1.append(6);
		SingleLinkedList num2 = new SingleLinkedList();
		num2.append(5);
		num2.append(9);
		num2.append(2);
		Node node = sumLists(num1.head, num2.head);
		while (node!=null){
			System.out.println(node.data + " ");
			node = node.next;
		}
		node = addLists(num1.head, num2.head, 0);
		while (node!=null){
			System.out.println(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

}
