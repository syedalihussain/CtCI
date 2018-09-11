package LeetCode;

public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int largestSum = nums[0];
		int currentSum = 0;
		for (int i=0; i<nums.length; i++) {
			if ((currentSum + nums[i]) > largestSum) {
				currentSum += nums[i];
				largestSum = currentSum;
			} else if (nums[i] > largestSum) {
				largestSum = nums[i];
				currentSum = nums[i];
			} else if ((nums[i] + currentSum) > largestSum) {
				currentSum += nums[i];
				largestSum = currentSum;
			} else {
				currentSum += nums[i];
			}
		}
		
		
		return largestSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		int[] array2 = new int[] {1, 2};
		System.out.println(maxSubArray(array));

	}

}
