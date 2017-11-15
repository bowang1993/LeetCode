class Solution {
    public int singleNumber(int[] nums) {
        int res =0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            res ^= nums[i];
        }
        return res;
    }
}
