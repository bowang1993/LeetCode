class Solution {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        for(int i=0; i+len2<=len1;i++){
            String str = haystack.substring(i,i+len2);
            if(str.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
