
boolean isPermutationOfPalindrome(String str) {
	int bitVector = getBitVector(str);
	return (bitVector == 0 || checkExactlyOneBitSet(bitVector));
}

int getBitVector(String str) {
	int bitVector = 0;
	for (char c : str.toCharArray()) {
		int val = getCharValue(c);
		bitVector = toggle(bitVector, val);
	}	
	return bitVector;
}

int getCharValue(char ch) {
	int a = Character.getNumericValue('a');
	int z = Character.getNumericValue('z');
	int c = Character.getNumericValue(ch);
	
	if (a<=c && c<=z)
		return c-a;
	return -1;
}

int toggle(int bitVector, int index) {
	if (index < 0)
		return v;
	
	int mask = 1 << index;
	if ((bitVector & mask) == 0) {
		bitVector |= mask;
	} else {
		bitVector &= ~mask;
	}
	return bitVector;	
}

boolean checkExactlyOneBitSet(int bitVector) {
	return (bitVector & (bitVector-1)) == 0;	
}