
public class MyQueue<T> {
	
	Stack<T> latest, oldest;
	public MyQueue() {
		latest = new Stack<T>();
		oldest = new Stack<T>();
	}
	
	public int size() {
		return newest.size() + oldest.size();
	}
	
	public void add(T value) {
		newest.push(T);
	}
	
	public void shiftStacks() {
		if (oldest.isEmpty()){
			while (!newest.isEmpty()){
				oldest.push(newest.pop());
			}
		}		
	}
	
	public T peek() {
		shiftStacks();
		return oldest.peek();
	}
	
	public T remove() {
		shiftStacks();
		return oldest.pop();
	}
	
	
}