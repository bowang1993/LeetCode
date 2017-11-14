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
    public static boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSymmetricHelp(root.left,root.right);
    }
    public static boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left == right;
        }
        if(left.val != right.val){
            return false;
        }
        return isSymmetricHelp(left.left,right.right) && isSymmetricHelp(left.right,right.left);
    }
}
