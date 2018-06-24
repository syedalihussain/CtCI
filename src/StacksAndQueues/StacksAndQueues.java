package StacksAndQueues;
import java.util.LinkedList;
import java.util.Queue;
public class StacksAndQueues {
	public static void testMyStack(){
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		for (int i=0; i<4; i++){
			System.out.println(stack.pop());
		}
	}
	public static void testMinStack(){
		System.out.println("Testing the minimum stack");
		StackWithMin minstack = new StackWithMin();
		minstack.push(3);
		minstack.push(5);
		minstack.push(2);
		minstack.push(1);
		
		System.out.println(minstack.min());
		minstack.pop();
		System.out.println(minstack.min());
		minstack.pop();
		System.out.println(minstack.min());
		minstack.pop();
		System.out.println(minstack.min());
	}
	public static void testQueueFromStacks(){
		StackQueue sq = new StackQueue();
		for (int i=0; i<=5; i++){
			sq.push(i);
		}
		for (int i=0; i<=5; i++){
			System.out.print(sq.pop() + " -> ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	testMyStack();
		//	testMinStack();
		testQueueFromStacks();
		
	}
}
