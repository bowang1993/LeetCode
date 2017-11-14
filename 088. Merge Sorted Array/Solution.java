class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m+n;
        m = m-1;
        n = n-1;
        int i = len-1;
        for( ; i>=0 && m>=0 && n>=0 ; i--){
            if(nums1[m] > nums2[n]){
                nums1[i]=nums1[m--];
            }else{
                nums1[i]=nums2[n--];
            }
        }
        while(m>=0){
            nums1[i--] = nums1[m--]; 
        }
        while(n>=0){
            nums1[i--] = nums2[n--];
        }
       
    }
}
