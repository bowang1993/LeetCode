import java.util.*;

class Solution {
    public String countAndSay(int n){
        if(n == 1)
            return "1";
        StringBuffer sb = new StringBuffer();
        String num = 1+"";
        Stack<String> stack = new Stack<String>();
        while(--n > 0){
            for(int i=0;i<num.length();i++){
                if(stack.isEmpty()){
                    stack.push(String.valueOf(num.charAt(i)));
                }else if(stack.peek().equals(String.valueOf(num.charAt(i)))){
                    stack.push(String.valueOf(num.charAt(i)));
                }else{
                    sb.append(stack.size());
                    sb.append(stack.peek());
                    stack.clear();
                    stack.push(String.valueOf(num.charAt(i)));
                }
            }  
            if(! stack.isEmpty()){
               sb.append(stack.size());
               sb.append(stack.peek());
               stack.clear();
            }
            num = sb.toString();
            sb = new StringBuffer();
        }
        return num;
    }
}
