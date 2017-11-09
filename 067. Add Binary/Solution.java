class Solution {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        String res = "";
        int carryBit = 0;
        for(int i=len1 - 1, j=len2 - 1 ; i>=0||j>=0 ; i--,j--){
            int x = i>=0 ?  a.charAt(i) - '0' : 0;
            int y = j>=0 ?  b.charAt(j) - '0' : 0;
            res = (x+y+carryBit)%2 + res;
            carryBit = (x+y+carryBit)/2;
        }
        if (carryBit == 1){
            res = 1 + res;
        }
        return res;
    }
}
