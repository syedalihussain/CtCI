package LeetCode;

public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int largestSum = nums[0];
		int currentSum = 0;
		for (int i=0; i<nums.length; i++) {
			currentSum += nums[i];
			if (currentSum > largestSum) {
				largestSum = currentSum;
			}
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		return largestSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		int[] array2 = new int[] {8,-19,5,-4,20};
		int[] array3 = new int[] {1, 2};
		System.out.println(maxSubArray(array1));

	}

}
