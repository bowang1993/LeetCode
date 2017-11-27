class Solution {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int carry = 0;
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<len1 || i<len2;i++){
            char a = i<len1 ? num1.charAt(len1-i-1) : '0';
            char b = i<len2 ? num2.charAt(len2-i-1) : '0';
            int x = a-'0' + b-'0' + carry;
            if( x >= 10){
                carry = 1;
                sb.insert(0,x-10);
            }else{
                carry = 0;
                sb.insert(0,x);
            }
        }
        if(carry == 1){
            sb.insert(0,carry);
        }
        return sb.toString();
    }
}
