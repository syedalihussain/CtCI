package arraysAndStrings;
public class stringCompression1_6 {
	public static String stringCompression(String str){
		char c = str.charAt(0); 
		int index = 0, counts = 0;
		char[] array = new char[str.length()*2];
		for (int i=0; i<str.length(); i++){
			if (c == str.charAt(i)){
				counts++;
			} else {
				array[index++] = c;
				array[index++] = (char) (counts+48);
				c = str.charAt(i);
				counts = 1;
			}
		}
		array[index++] = c;
		array[index++] = (char) (counts+48);
		
		String temp = new String(array);
		String res = temp.substring(0, index);
		return res.length() < str.length() ? res : str; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("abcd");
		System.out.println(stringCompression(str));
	}
}
