package StacksAndQueues;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CancellationException;
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
	public static MyStack<Integer> sortStack(MyStack<Integer> stack){
		MyStack<Integer> tempStack = new MyStack<Integer>();
		if (!stack.isEmpty())
			tempStack.push(stack.pop());
		else
			return new MyStack<Integer>();
		while (!stack.isEmpty()){
			Integer tempInt = stack.pop();
			while (!tempStack.isEmpty() && tempStack.peek()>tempInt){
				stack.push(tempStack.pop());
			}
			tempStack.push(tempInt);
		}
		
		return tempStack;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	testMyStack();
		//	testMinStack();
		//	testQueueFromStacks();
		
		/*
		 * Question no 3.5
		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(1);
		stack.push(12);
		stack.push(5);
		stack.push(3);
		stack.push(8);
		stack.push(7);
		MyStack<Integer> sortedStack = sortStack(stack);
		while(!sortedStack.isEmpty()){
			System.out.println(sortedStack.pop());
		}
		*/
		//	Question 3.6
		AnimalShelter shelter = new AnimalShelter();
		shelter.enqueue(new Cat("Meow"));
		shelter.enqueue(new Cat("Purr"));
		shelter.enqueue(new Dog("Woof"));
		shelter.enqueue(new Dog("Simba"));
		
		System.out.println(shelter.dequeueAny().name);
		System.out.println(shelter.dequeueDogs().name);
		System.out.println(shelter.dequeueCats().name);
		System.out.println(shelter.dequeueAny().name);
	}
}
