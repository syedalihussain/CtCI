package LinkedLists;

public class partition2_4 {
	public static boolean partition(Node node, int p){
		if (node == null) return false;
		Node leadPntr = node;
		Node lagPntr = node;
		int temp;
		while (leadPntr != null){
			if (leadPntr.data < p){
				temp = lagPntr.data;
				lagPntr.data = leadPntr.data;
				leadPntr.data = temp;
				while (lagPntr.data < p){
					if (lagPntr == null) return true;
					lagPntr = lagPntr.next;
				}
			}
			leadPntr = leadPntr.next;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sll = new SingleLinkedList();
		sll.append(3);
		sll.append(5);
		sll.append(8);
		sll.append(5);
		sll.append(10);
		sll.append(2);
		sll.append(1);
		boolean done = partition(sll.head, 5);
		Node node = sll.head;
		while(node!=null){
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}
