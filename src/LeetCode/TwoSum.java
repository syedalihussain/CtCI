package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
	
	private static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int[] res = new int[2];
		for (int i=0; i<nums.length; i++) {
			int diff = target - nums[i];
			if (hm.containsKey(nums[i])){
				res[0] = hm.get(nums[i]);
				res[1] = i;
			} else {
				hm.put(diff, i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[] {2, 7, 11, 15};
		int[] res = twoSum(num, 9);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
//		System.out.println(res);
		
	}

}
