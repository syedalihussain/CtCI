//	Useful Java Fuctions

//	Convert a String to a char array
String str = "abcdef";
char[] charArray = str.toCharArray();

//	Sorting a character array
Arrays.sort(charArray);

//	Print the name of the super class on a new line
System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

//	How to define a class within a class
public class MyStack<T> {
	
	private static class StackNode<T> {
		
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data) {
			this.data = data;			
		}		
	}	
	
}

//	Convert a charArray to a string
char[] content = str.toCharArray();
String str = new String(content);

//	Comparing two strings
str1.equals(str2);