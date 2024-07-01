package code;

public class MaximumSubarray_53 {
    class Solution {
        public int maxSubArray(int[] nums) {
            if (null == nums || nums.length == 0) {
                return 0;
            }
            if (nums.length == 1) {
                return nums[0];
            }
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            }
            int result = dp[0];
            for (int i = 0; i < nums.length; i++) {
                result = Math.max(result, dp[i]);
            }
            return result;
        }
    }
}
