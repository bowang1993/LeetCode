class Solution {
    public String convertToTitle(int n) {
       //return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
        StringBuffer sb = new StringBuffer();
        while(n>0){
            n--;
            sb.insert(0,((char)( n%26 + 'A' )));
            n /= 26;
        }
        return sb.toString();
    }
}
