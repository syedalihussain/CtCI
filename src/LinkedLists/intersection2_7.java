package LinkedLists;

class Result {
	public Node tail;
	public int size;
	public Result(Node node, int size) {
		this.tail = node;
		this.size = size;
	}
}
public class intersection2_7 {
	public static Node findIntersection(Node list1, Node list2) {
		if (list1 == null || list2 == null) return null;
		
		/*	Get tails and sizes for both lists. */
		Result r1 = getTailAndSize(list1);
		Result r2 = getTailAndSize(list2);
		
		/*	If different tails then no intersection. */
		if (r1.tail != r2.tail) return null;
		
		Node shorter = r1.size < r2.size ? list1 : list2;
		Node longer = r1.size < r2.size ? list2 : list1;
		
		/*	Advance the pointer of the longer linked list by the difference. */
		longer = getKthNode(longer, Math.abs(r1.size - r2.size));
		
		while (shorter != longer) {
			shorter = shorter.next;
			longer = longer.next;
		}
		
		return shorter;
	}
	
	public static Result getTailAndSize(Node list) {
		if (list == null) return null;
		
		int size = 1;
		Node current = list;
		while (current.next != null){
			current = current.next;
			size++;
		}
		return new Result(current, size);
	}
	
	public static Node getKthNode(Node head, int offset) {
		Node current = head;
		while(offset>0 && current!=null){
			current = current.next;
			offset--;
		}
		return current;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList sll2 = new SingleLinkedList();
		sll2.append(7);
		sll2.append(1);
		sll2.append(6);
		sll2.append(9);
		sll2.append(9);
		SingleLinkedList sll1 = new SingleLinkedList();
		sll1.append(8);
		sll1.append(8);
		Node intersecting = new Node(5);
		sll1.append(intersecting);
		sll2.append(intersecting);
		
		sll1.append(1);
		sll1.append(2);
		sll1.append(3);
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
		
		Node result = findIntersection(sll1.head, sll2.head);
		System.out.println(result.data);
	}

}
