package LinkedLists;
import java.util.*;
public class removeDuplicates2_1 {
	public static void removeDups(LinkedList<String> llist){
		HashSet<String> hashset = new HashSet<String>();
		Iterator<String> ptr = llist.iterator();
		while(ptr.hasNext()) {
			String value = ptr.next();
			if (hashset.contains(value)) {
				ptr.remove();
			} else {
				hashset.add(value);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("a");
		ll.add("a");
		ll.add("b");
		ll.add("a");
		ll.add("c");

		removeDups(ll);
		Iterator<String> itr=ll.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
