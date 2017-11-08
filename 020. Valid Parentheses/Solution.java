import java.util.*;
class Solution {
    public boolean isValid(String s) {
        char[] chs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : chs){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char tmp = stack.pop();
                char chtmp = tmp;
                switch (ch){
                    case ')':
                        chtmp = '(';
                        break;
                    case '}':
                        chtmp = '{';
                        break;
                    case ']':
                        chtmp = '[';
                        break;
                         
                }
                if(tmp != chtmp){
                    return false;
                }
                    
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
