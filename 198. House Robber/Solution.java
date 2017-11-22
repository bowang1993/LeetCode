class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] resArr = new int[len];
        if(len == 0)
            return 0;
        if(len == 1)
            return nums[0];
        if(len == 2)
            return Math.max(nums[0],nums[1]);
        resArr[0] = nums[0];
        resArr[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<len;i++){
            resArr[i] = Math.max(resArr[i-1],resArr[i-2]+nums[i]);
        }
        return Math.max(resArr[len-1],resArr[len-2]);
    }
}
