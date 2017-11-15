class Solution {
    public int majorityElement(int[] nums) {
        // Moore's voting algorithm
        int count = 0;
        int res = 0;
        for(int num : nums){
            if(count == 0){
                res = num;
            }
            if(res == num){
                count++;
            }else{
                count--;
            }
        }
        return res;
    }
}
