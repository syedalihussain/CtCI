package StacksAndQueues;

public class StackWithMin extends MyStack<Integer> {
	MyStack<Integer> minstack;
	
	public StackWithMin() {
		// TODO Auto-generated constructor stub
		minstack = new MyStack<Integer>();
	}
	
	public void push(int value){
		if (value <= min()) minstack.push(value);
		super.push(value);
	}
	
	public Integer pop(){
		int value = super.pop();
		if (value == min())
			minstack.pop();
		return value;
	}
	public int min(){
		if (minstack.isEmpty()) return Integer.MAX_VALUE;
		else return minstack.peek();
	}
}
