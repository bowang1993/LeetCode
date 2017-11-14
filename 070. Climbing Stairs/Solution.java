import java.util.*;
class Solution {
    public int climbStairs(int n) {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,1);
        map.put(2,2);
        for(int i=3;i<=n;i++){
            if(!map.containsKey(i)){
                int n1 = map.get(i-1);
                int n2 = map.get(i-2);
                map.put(i,n1+n2);
            }
        }
        return map.get(n);
    }
}
