package Q5_02_Binary_to_String;

public class Question {
	
	private static String printBinary(double num) {
		if (num>=1 || num<=0)
			return "ERROR";
		
		StringBuilder sb = new StringBuilder();
		sb.append(".");
		
		
		while(num > 0) {
			if (sb.length() >= 32)
				return "ERROR";
			
			double r = 2 * num;
			
			if (r >= 1){
				sb.append("1");
				num = r - 1;
			} else {
				sb.append("0");
				num = r;
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 0.625;
		System.out.println(printBinary(d));
	}
}
