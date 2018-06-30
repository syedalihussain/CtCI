package StacksAndQueues;

public abstract class Animal {
	private int order;
	public String name;
	public Animal(String name) {
		this.name = name;
	}
	
	public void setOrder(int order){ this.order = order; }
	
	public int getOrder(){ return this.order; }
	
	public boolean isOlderThan(Animal a) { return this.order < a.getOrder(); }
}
