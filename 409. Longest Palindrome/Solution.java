class Solution {
    public int longestPalindrome(String s) {
        char[] map = new char[52];
        for(int i=0;i<s.length();i++){
            char tmp = s.charAt(i);
            if('a'<=tmp && 'z'>=tmp){
                map[tmp-'a']++;
            }
            if('A'<=tmp && 'Z'>=tmp){
                map[tmp-'A'+26]++;
            }
        }
        int res = 0;
        int hasOdd = 0;
        for(int i=0;i<map.length;i++){
            if(map[i]%2==0)
                res += map[i];
            else{
                hasOdd = 1;
                res+=map[i]-1;
            }      
        }
        return res + hasOdd;
    }
}
