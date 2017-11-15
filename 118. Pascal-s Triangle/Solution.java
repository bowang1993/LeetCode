class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> wrapList = new ArrayList<List<Integer>>();
        if(numRows <= 0)
            return wrapList;
        for(int i=0;i<numRows;i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list.add(j,1);
                }else{
                    list.add(j, wrapList.get(i-1).get(j-1) + wrapList.get(i-1).get(j));
                }
            }
            wrapList.add(list);
        }
        return wrapList;
    }
}
