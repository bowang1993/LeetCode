/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode head = null;
        head = help(nums,0,nums.length-1);
        return head;
    }
    
    public static TreeNode help(int[] nums,int left,int right){
        TreeNode res = null;
        if(right - left < 0)
            return null;
        if(right - left == 0){
            res = new TreeNode(nums[left]);
            return res;
        }
        if(right - left == 1){
            //res = new TreeNode(nums[left]);
            //res.right = new TreeNode(nums[right]);
            res = new TreeNode(nums[right]);
            res.left = new TreeNode(nums[left]);
            return res;
        }
        int mid = left + (right - left)/2;
        res = new TreeNode(nums[mid]);
        res.left = help(nums,left,mid-1);
        res.right = help(nums,mid+1,right);
        return res;
    }
}
