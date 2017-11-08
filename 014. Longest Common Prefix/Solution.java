class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        if(strs.length == 1)
            return strs[0];
        String res = "";
        for(String str : strs){
            res = getTwoStrCommonPrefix(res,str);
        }
        return res;
    }
    
    public String getTwoStrCommonPrefix(String str1, String str2){
        if(str1 == "" || str2 == "")
            return str1+str2;
        int len1 = str1.length();
        int len2 = str2.length();
        int min = Math.min(len1,len2);
        for(int i=0;i<min;i++){
            if(str1.charAt(i) != str2.charAt(i))
                return str1.substring(0,i);
        }
        return str1.substring(0,min);
    }
}
