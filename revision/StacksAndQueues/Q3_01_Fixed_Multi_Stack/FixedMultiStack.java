


public class FixedMultiStack() {
	
	private int stackCapacity;
	private int numberOfStacks = 3;
	private int[] values;
	private int[] sizes;
	
	
	public FixedMultiStack(int stackSize) {
		this.stackCapacity = stackSize;
		values = new int[stackCapacity * numberOfStacks];
		sizes = new int[numberOfStacks];	
	}
	
	public void push(int stack, int value) throws FullStackException {
		if (isFull(stack)) {
			throw new FullStackException();			
		}
		
		sizes[stack]++;
		values[indexOfTop(stack)] = value;
	}
	
	
	public int peek(int stack) {
		if (isEmpty(stack)) {
			throw new EmptyStackException();			
		}
		
		return values[indexOfTop(stack)];		
	}
	
	public int pop(int stack) {
		if (isEmpty(stack)) {
			throw new EmptyStackException();			
		}
		
		int topIndex = indexOfTop(stack);
		int value = values[topIndex];
		values[topIndex] = 0;
		sizes[stack]--;
		return value;		
	}
	
	public boolean isEmpty(int stackNum) {
		return sizes[stackNum] == 0;
	}
	
	public boolean isFull(int stackNum) {
		return sizes[stackNum] == stackCapacity;
	}
	
	public int indexOfTop(int stackNum) {
		int offset = numberOfStacks * stackNum;
		return offset + sizes[stackNum] - 1;
		
	}
	
	
	
}

public class FixedMultiStack {
	
	private int stackCapacity;
	private int numberOfStacks = 3;
	private int[] values;
	private int[] sizes;
	
	public FixedMultiStack(int stackSize) {
		this.stackCapacity = stackSize;
		this.values = new int[stackSize * numberOfStacks];
		this.sizes = new int[numberOfStacks];
	}
	
	public void push(int value, int stackNum) throws FullStackException {
		if (isFull(stackNum))
			throw new FullStackException();
		sizes[stackNum]++;
		values[indexOfTop(stack)] = value;
	}
	
	public int pop(int stack) {
		if (isEmpty(stack)) {
			throw new EmptyStackException();			
		}
		
		int topIndex = indexOfTop(stack);
		int value = values[topIndex];
		values[topIndex] = 0;
		sizes[stack]--;
		return value;
	}
	
	public int peek(int stack) {
		if (isEmpty(stack)) {
			throw new EmptyStackException();			
		}
		
		return values[indexOfTop(stack)];
	}
	
	public boolean isEmpty(int stackNum) {
		return sizes[stackNum] == 0;
	}
	
	public boolean isFull(int stackNum) {
		return sizes[stackNum] == stackCapacity;
	}
	
	public int indexOfTop(int stackNum) {
		int offset = numberOfStacks * stackNum;
		return offset + sizes[stackNum] - 1;
		
	}
	