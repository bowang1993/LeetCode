class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            res += (c-'A'+1) * Math.pow(26, len-i-1);//   (c-'A'+1)*(i*26);
        }
        return res;
    }
}
