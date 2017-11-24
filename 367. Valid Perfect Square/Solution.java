class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 0)
            return false;
        float left = 1;
        float right = num;
        float mid;
        while(left <= right){
             mid = (int)(right+left) >>> 1;
            if(mid * mid == num)
                return true;
            if(mid*mid < num){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        return false;
    }
}
