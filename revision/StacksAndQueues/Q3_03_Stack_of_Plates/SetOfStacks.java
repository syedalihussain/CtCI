

public class SetOfStacks {
	
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	public int capacity;
	
	public SetOfStacks(int capacity) {
		this.capacity = capacity;
	}
	
	public void push(int value) {
		Stack last = getLastStack();
		if (!last.isFull() && last!=null) {
			last.push(value);
		} else {
			Stack s = new Stack(capacity);
			s.push(value);
			stacks.add(s);
		}
	}
	
	public int pop() {
		Stack last = getLastStack();
		if (last.isEmpty() || last==null) throw new EmptyStackException();
		int value = last.pop();
		if (last.size == 0) stacks.remove(stacks.size() - 1);
		return value;
	}
	
	public boolean isEmpty() {
		Stack last = getLastStack();
		return last == null || last.isEmpty();		
	}
	
	public int popAt(int index) {
		return leftShift(index, true);
	}
	
}