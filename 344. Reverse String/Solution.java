class Solution {
    public String reverseString(String s) {
        char[] chs = s.toCharArray();
        int left = 0;
        int right = chs.length-1;
        while(left < right){
            char tmp = chs[left];
            chs[left] = chs[right];
            chs[right] = tmp;
            left++;
            right--;
        }
        return new String(chs);
    }
}
