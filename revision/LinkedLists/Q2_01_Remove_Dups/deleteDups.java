
void deleteDups(LinkedListNode head) {

	LinkedListNode current = head;
	while (current!=null) {
		
		LinkedListNode runner = current;
		while (runner.next!=null) {
			if (current.data == runner.next.data) {
				runner.next = runner.next.next;
			} else {
				runner = runner.next;
			}
		}		
		current = current.next;
	}	
}