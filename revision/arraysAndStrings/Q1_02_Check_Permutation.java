

boolean permutation(String s, String t) {
	if (s.length() != t.length())
		return false;
	
	int count = 0;
	int[] frequencies = new int[128];
	for (char c : s.toCharArray()) {
		frequencies[c]++;		
	}
	
	for (char c : t.toCharArray()) {
		frequencies[c]--;
		if (frequencies[c] < 0 )
			return false;
	}
	return true;
}

