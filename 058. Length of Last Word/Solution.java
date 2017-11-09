class Solution {
    public int lengthOfLastWord(String s) {
        while(s.startsWith(" ")){
            s = s.substring(1);
        }
        while(s.endsWith(" ")){
            s = s.substring(0,s.length()-1);
        }
        if(s.equals("")){
            return 0;
        }
        int cur = s.length()-1;
        for (; cur>=0;cur--){
            if(s.charAt(cur)==' '){
                return s.substring(cur+1).length();
            }
        }
        return s.length();
    }
}
