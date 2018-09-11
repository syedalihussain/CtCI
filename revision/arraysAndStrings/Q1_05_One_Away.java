
boolean oneEditAway(String s, String t) {
	if (Math.abs(s.length() - t.length()) > 1)
		return false;
	
	String s1 = s.length() > t.length() ? s : t;
	String s2 = s.length() > t.length() ? t : s;
	
	int index1 = 0, index2 = 0;
	boolean foundDiff = false;
	
	while (index1<s1.length() && index2<s2.length()) {
		
		char c1 = s1.charAt(index1);
		char c2 = s2.charAt(index2);
		
		if (c1 != c2){
			if (foundDiff)
				return false;
			else
				foundDiff = true;
			if (s1.length()==s2.length())
				index2++;
		} else {
			index2++;
		}
		index1++;
	}
	return true;
}