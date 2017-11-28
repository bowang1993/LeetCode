class Solution {
    public int compress(char[] chars) {
        int slow = 1;
        int count = 1;
        for(int fast=1;fast<chars.length;fast++){
            if(chars[fast]==chars[fast-1]){
                count ++;
            }else{
                if(count>1){
                    char[] num = (count+"").toString().toCharArray();
                    for(char c : num){
                        chars[slow++]=c;
                    }
                }
                count = 1;
                chars[slow++] = chars[fast];
            }
        }
        if(count > 1){
            char[] num = (count+"").toString().toCharArray();
            for(char c:num){
                chars[slow++]=c;
            }
        }
        return slow;
    }
}
