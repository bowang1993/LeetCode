class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <=1)
            return true;
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]+","");
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
}
