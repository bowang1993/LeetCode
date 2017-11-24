import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        char ch1 = 'a';
        char ch2 = 'a';
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        HashMap<String,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        for(String tmp : strs){
            if(map1.keySet().contains(tmp)){
                sb1.append(map1.get(tmp));
            }else{
                sb1.append(ch1);
                map1.put(tmp,ch1++);
            }
        }
        for(int i=0;i<pattern.length();i++){
            if(map2.keySet().contains(pattern.charAt(i))){
                sb2.append(map2.get(pattern.charAt(i)));
            }else{
                sb2.append(ch2);
                map2.put(pattern.charAt(i),ch2++);
            }
        }
        return sb1.toString().equals(sb2.toString());
    }
}
