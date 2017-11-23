class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArr = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            sArr[ch-'a']++;
        }
        for(int j=0;j<t.length();j++){
            char ch = t.charAt(j);
            sArr[ch-'a']--;
        }
        for(int k=0;k<26;k++){
            if(sArr[k] != 0)
                return false;
        }
        return true;
    }
}
