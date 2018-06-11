package package1;
import java.util.*;
public class URLify1_3 {
	public static String URLify(String str, int i){
		char[] array = new char[str.length()];
		int index=0, end = 0;
		for (int j=0; end<i; j++){
			char currChr = str.charAt(j);
			if (currChr != ' '){
				array[index++] = currChr;
				end++;
			} else {
				array[index++] = '%';
				array[index++] = '2';
				array[index++] = '0';
				end++;
			}
		}
		return new String(array);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0;
		String str = "Mr John Smith    ";
		char[] array = str.toCharArray();
		array[index++] = '%';
		array[index++] = '2';
		array[index++] = '0';
		String res = URLify(str, 13);
		System.out.println(res);
	}

}
