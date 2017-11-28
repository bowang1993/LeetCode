import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pmap = new int[26];
        for(int i=0;i<p.length();i++)
            pmap[p.charAt(i)-'a']++;
        ArrayList<Integer> list = new ArrayList<>();
        if(s.length()<p.length())
            return list;
        outer:
        for(int i=0;i+p.length()<=s.length();i++){
            int[] smap = new int[26];
            for(int j=0;j<p.length();j++)                
                smap[s.charAt(i+j)-'a']++;
            for(int k=0;k<26;k++){
                if(smap[k] != pmap[k])
                    continue outer;
            }
            list.add(i);
        }
        return list;
    }
}
