package StacksAndQueues;
import java.util.LinkedList;
import java.util.Queue;
public class StacksAndQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		for (int i=0; i<4; i++){
			System.out.println(stack.pop());
		}
		
	}
}
