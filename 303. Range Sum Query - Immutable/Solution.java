class NumArray {
    int[] res;
    public NumArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        this.res = nums;
    }
    
    public int sumRange(int i, int j) {
        if(i==0){
            return res[j];
        }
        return res[j]-res[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
