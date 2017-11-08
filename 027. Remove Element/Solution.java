class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;
        int ptr = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[ptr++] = nums[i];
            }else{
                continue;
            }
        }
        return ptr;
    }
}
