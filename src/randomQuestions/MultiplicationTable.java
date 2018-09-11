package randomQuestions;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 7;
		
		printMultiplicationTable(number);
	}

	private static void printMultiplicationTable(int number) {
		System.out.println("Multiplication table for " + number);
		System.out.println("---------------------------");
		for (int i=1; i<=10; i++) {
			System.out.format("%2d x %d = %3d\n", i,number,i*number);
		}
		String str = "a";
		System.out.println((int) str.charAt(0));
		System.out.println(Character.getNumericValue('a'));
	}

}
