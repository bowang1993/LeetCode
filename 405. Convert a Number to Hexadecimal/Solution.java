class Solution { 
    
    public String toHex(int num) {
        if(num==0)
            return "0";
        int x = 0xf;
        StringBuffer sb = new StringBuffer();
        while(num!=0){
            int tmp = x & num;
            if (tmp<10)
                sb.insert(0,tmp);
            else
                sb.insert(0,(char)((tmp-10) +'a'));
            num >>>= 4;
        }
        return sb.toString();
    }
}
