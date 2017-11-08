class Solution {
    public int reverse(int x) {
        if(x==0)
            return 0;
        try{
            String s = String.valueOf(x);
            StringBuffer sb = new StringBuffer();
            if(x>0){
                char[] ch = s.toCharArray();
                for(int i=ch.length-1;i>=0;i--){
                    sb.append(ch[i]);
                }
                return Integer.parseInt(sb.toString());
            }else{
                char[] ch = s.toCharArray();
                sb.append("-");
                for(int i=ch.length-1;i>0;i--){
                    sb.append(ch[i]); 
                }
                return Integer.parseInt(sb.toString());
            }
        }catch(NumberFormatException e){
            return 0;
        }
    }
}
