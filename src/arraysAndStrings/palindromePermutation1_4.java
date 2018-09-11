package arraysAndStrings;
import java.util.*;
public class palindromePermutation1_4 {
	public static boolean palindromePermutation(String str){
		String newStr = str.toLowerCase();
		int[] frequencies = new int[30];
		int odds = 0;
		for (int i=0; i<str.length(); i++){
			if (newStr.charAt(i) != ' '){
			int num = newStr.charAt(i) - 'a';
			frequencies[num]++;
			if (frequencies[num]%2==0)
				odds--;
			else
				odds++;
			}
		}
		if (str.length()%2==0 && odds==0) return true;
		else if (odds==1) return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Tact Coa");
		System.out.println(palindromePermutation(str));

	}

}
