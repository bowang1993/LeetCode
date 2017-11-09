public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int max = nums[0];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = dp[i-1]>0? dp[i-1] + nums[i] : nums[i];
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
