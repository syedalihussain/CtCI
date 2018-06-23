package StacksAndQueues;

import java.util.EmptyStackException;

public class FixedMultiStack {
	private int numberOfStacks = 3;
	private int stackCapacity;
	private int[] values;
	private int[] sizes;
	
	public FixedMultiStack(int stackSize){
		this.stackCapacity = stackSize;
		values = new int[stackSize * numberOfStacks];
		sizes = new int[numberOfStacks];
	}
	
	/*	Push value onto stack. */
	public void push(int stackNum, int value){
		if (isFull(stackNum)) throw new StackOverflowError();
		values[getTopIndex(stackNum)] = value;
		sizes[stackNum]++;
	}
	
	/*	Pop value from stack. */
	public int pop(int stackNum){
		if (isEmpty(stackNum)) throw new EmptyStackException();
		int topIndex = getTopIndex(stackNum);
		int value = values[topIndex];
		values[topIndex] = 0; // Clear the value
		sizes[stackNum]--; // Reducing the size
		return value;
	}
	
	public int peek(int stackNum){
		if (isEmpty(stackNum)) throw new EmptyStackException();
		return values[getTopIndex(stackNum)];
	}
	
	public boolean isFull(int stackNum){
		return sizes[stackNum] == this.stackCapacity;
	}
	
	public boolean isEmpty(int stackNum){
		return sizes[stackNum] == 0;
	}
	
	public int getTopIndex(int stackNum){
		int offset = stackNum * stackCapacity;
		int size = sizes[stackNum];
		return offset + size - 1;
	}
}
