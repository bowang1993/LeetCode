class Solution {
    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        long mid = left + (right-left)/2;
        while(left <= right){
            if(mid*(1+mid)/2==n || mid*(1+mid)/2 < n && (mid+1)*(mid+2)/2 > n)
                return (int)mid;
            if((mid*(1+mid)/2)<n)
                left = (int)mid+1;
            if((mid*(1+mid)/2)>n)
                right = (int)mid-1;
            mid = left+(right-left)/2;
        }
        return left;
    }
}
