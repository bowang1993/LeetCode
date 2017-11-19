class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        if(k==0)
            return;
        reverseChars(nums,0,len - k - 1);
        reverseChars(nums,len -k,len-1);
        reverseChars(nums, 0,len-1);
       
    }
    
    public void reverseChars(int[] nums, int start, int end){
        while(start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
