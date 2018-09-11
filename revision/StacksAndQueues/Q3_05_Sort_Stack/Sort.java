
void sort(Stack<Integer> s) {
	Stack<Integer> r = new Stack<Integer>();
	
	while(!s.isEmpty()) {
		int temp = s.pop();
		
		while (!r.isEmpty() && temp<r.peek()) {
			s.push(r.pop());
		}		
		r.push(tmp);
	}
	
	/* Copying the elements back */
	while (!r.isEmpty()) {
		s.push(r.pop());
	}
}