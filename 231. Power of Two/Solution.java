class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)
            return false;
        n -= 1;
        while(n != 0){
            if((n & 1) != 1)
                return false;
            n = n >>> 1;
        }
        return true;
    }
}
