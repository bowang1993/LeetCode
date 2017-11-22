class Solution {
    public int countPrimes(int n) {
        if(n<2)
            return 0;
        boolean[] barr = new boolean[n];
        int count = n-2;
        for(int i=2;i*i<n;i++){
            if(!barr[i]){
                for(int j=i;i*j<n;j++){
                    if(!barr[i*j]){
                        barr[i*j]=true;
                        count--;
                    }
                }
            }
        }
        return count;
    }
}
