import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] res;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums1){
            if(!map.keySet().contains(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }    
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums2){
            if(map.keySet().contains(num) && map.get(num)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
