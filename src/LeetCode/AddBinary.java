package LeetCode;

public class AddBinary {
	
	private static String addBinary(String a, String b) {
		//	Initialize StringBulider
		StringBuilder sb = new StringBuilder();
		
		//	Initialize indexes and 
		int i = a.length()-1;
		int j = b.length()-1;
		int c = 0;
		short s = 0;
		while(i>=0 || j>=0 || c==1) {
			
			s += ((i >= 0) ? a.charAt(i) -'0' : 0);
			s += ((j >= 0) ? b.charAt(j) -'0' : 0);
			s += c;
			
			if (s==1 || s==3){
				sb.append(1);
			} else {
				sb.append(0);
			}
			System.out.println(s);
			
			
			i--;j--;
			c=s/2;
			s=0;
			
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="11", s2="1";
		
		System.out.println(addBinary(s1, s2));
	}

}
