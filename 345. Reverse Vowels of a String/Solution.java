class Solution {
    public String reverseVowels(String s) {
        char[] chs = s.toCharArray();
        int left = 0;
        int right = chs.length -1;
        while(left < right){
            if(!isVowels(chs[left])){
                left++;
                continue;
            }
            if(!isVowels(chs[right])){
                right--;
                continue;
            }
            char tmp = chs[left];
            chs[left] = chs[right];
            chs[right] = tmp;
            left++;
            right--;
        }
        return new String(chs);
    }
    
    public boolean isVowels(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U')
            return true;
        return false;
    }
}
