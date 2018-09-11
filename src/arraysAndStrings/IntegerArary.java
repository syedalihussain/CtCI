package arraysAndStrings;

public class IntegerArary {
	
	private static int largestInteger(int[] nums) {
		
		int largest = Integer.MIN_VALUE;
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i] > largest) {
				largest = nums[i];
			}
		}
		
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {0, 2, 3, 1, 5};
		System.out.println(largestInteger(nums));
	}

}
