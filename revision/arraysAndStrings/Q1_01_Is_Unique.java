
boolean isUniqueChars(String str) {
	boolean[] arr = new boolean[128];
	for(int i=0; i<str.length(); i++) {
		int val = str.charAt(i) - 'a';
		if (arr[val])
			return false;
		arr[val] = true;
	}
	return true;
}