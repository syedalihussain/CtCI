
public StackWithMin extends Stack<Integer> {
	
	Stack<Integer> minstack;
	
	public StackWithMin() {
		minstack = new Stack<Integer>();		
	}
	
	public void push(int value) {
		if (value <= min()) {
			minstack.push(value);
		}
		super.push(value);
	}
	
	public void pop() {
		int value = super.pop();
		if (value == min()) {
			minstack.pop();
		}
		return value;
	}
	
	public int min() {
		if (minstack.isEmpty()) {
			throw new EmptyStackException();
		} else {
			minstack.peek();
		}
	}
}