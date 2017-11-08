class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int minus = target - nums[i];
            for(int j=0;j<nums.length && i != j;j++){
                if(minus == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
