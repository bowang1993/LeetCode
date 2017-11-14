class Solution {
    public int mySqrt(int x) {
        if(x<1){
            return 0;
        }
        int left = 1;
        int right = x;
        int mid = left + (right-left)/2;
        while(left <= right){
            if(x/mid >= mid && x/(mid+1) < mid+1){
               return mid; 
            }
            if(x/mid > mid){
                left = mid+1;
                mid = left + (right-left)/2;
            }
            if(x/mid < mid){
                right = mid -1;
                mid = left + (right-left)/2;
            }
        }
        return -1;
    }
}
