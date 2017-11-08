class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int ptr = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[ptr])
                continue;
            else{
                nums[++ptr] = nums[i];
            }
        }
        return ptr+1;
    }
}
