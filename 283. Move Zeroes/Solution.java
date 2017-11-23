class Solution {
    public void moveZeroes(int[] nums) {
        int ptr = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ptr++]=nums[i];
            }
        }
        while(ptr<nums.length){
            nums[ptr++]=0;
        }
    }
}
