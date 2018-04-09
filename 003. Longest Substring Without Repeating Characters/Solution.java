class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       if(s.length()==0 || s==null)
           return 0;
       
        Deque<Character> deque = new ArrayDeque<>();
        int max_len = 0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(deque.contains(c)){
                if(max_len < deque.size()){
                    max_len = deque.size();
                }
                while(c != deque.peekFirst()){
                    deque.removeFirst();
                }
                deque.removeFirst();
                deque.addLast(c);
            }else{
                deque.addLast(c);
                if(max_len < deque.size())
                    max_len = deque.size();
            }
        }
        return max_len;
    }
}
