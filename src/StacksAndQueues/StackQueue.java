package StacksAndQueues;

public class StackQueue {
	//	Lazy implementation of a Queue using two stacks
	MyStack<Integer> simple;
	MyStack<Integer> reverse;
	
	public StackQueue() {
		// TODO Auto-generated constructor stub
		simple = new MyStack<Integer>();
		reverse = new MyStack<Integer>();
	}
	
	public void push(int value){
		simple.push(value);
	}
	
	public Integer pop(){
		if (!reverse.isEmpty()) return reverse.pop();
		else {
			while (!simple.isEmpty()){
				reverse.push(simple.pop());
			}
			return reverse.pop();
		}
	}
}
