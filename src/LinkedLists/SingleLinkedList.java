package LinkedLists;

public class SingleLinkedList {
	Node head;
	public void append(int d) {
		if (head == null) {
			head = new Node(d);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(d);
	}
	
	public void append(Node n){
		if (head == null) {
			head = n;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = n;
	}
	public void prepend(int d) {
		if (head == null) {
			head = new Node(d);
			return;
		}
		Node newnode = new Node(d);
		newnode.next = head;
		head = newnode;
	}
	public void deleteFirst(int d) {
		if (head == null) return;
		Node current = head;
		while (current.next.data != d) {
			current = current.next;
		}
		
	}
}
