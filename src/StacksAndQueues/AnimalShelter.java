package StacksAndQueues;

import java.util.LinkedList;

public class AnimalShelter {
	//	Animal Shelter for Question 3.6
	LinkedList<Dog> dogs = new LinkedList<>();
	LinkedList<Cat> cats = new LinkedList<>();
	private int order = 0;
	
	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		
		if (a instanceof Cat) cats.add((Cat) a);
		else dogs.add((Dog) a);
	}
	
	public Animal dequeueAny(){
		if (dogs.size() == 0){
			return dequeueCats();
		} else if (cats.size() == 0){
			return dequeueDogs();
		}
		
		Dog d = dogs.peek();
		Cat c = cats.peek();
		
		if (d.isOlderThan(c)){
			return dequeueDogs();
		} else {
			return dequeueCats();
		}
	}
	
	public Dog dequeueDogs(){
		return dogs.poll();
	}
	
	public Cat dequeueCats(){
		return cats.poll();
	}
}
