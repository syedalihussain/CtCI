package package1;

public class oneAway1_5 {
	public static boolean oneAway(String s1, String s2){
		if (Math.abs(s1.length() - s2.length()) > 1) return false;
		if (s1.length() == s2.length()){
			int num = 0;
			for (int i=0; i<s1.length(); i++){
				if (s1.charAt(i) != s2.charAt(i))
					num++;
				if (num>1) return false;
			}
			return true;
		}
		String larger = (s1.length() > s2.length()) ? s1 : s2;
		String smaller = (s1.length() < s2.length()) ? s1 : s2;
		int index = 0, changes = 0;
		for (int i=0; i<smaller.length(); i++){
			if (smaller.charAt(i) != larger.charAt(index)){
				changes++;
				index++;
			}
			if (changes > 1) return false;
			index++;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("pale");
		String s2 = new String("bake");
		System.out.println(oneAway(s1, s2));
	}

}
