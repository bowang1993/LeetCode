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
    public static boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        return isBalancedHelper(root);
    }
    public static boolean isBalancedHelper(TreeNode node){
        if(node == null)
            return true;
        if(node.left == null && node.right == null)
            return true;
        if(Math.abs(maxDepth(node.left) - maxDepth(node.right)) < 2 )
            return isBalancedHelper(node.left) && isBalancedHelper(node.right);
        else
            return false;
    }
    public static int maxDepth(TreeNode node){
        if(node == null)
            return 0;
        if(node.left==null && node.right==null)
            return 1;
        if(node.left==null)
            return maxDepth(node.right)+1;
        if(node.right==null)
            return maxDepth(node.left)+1;
        return Math.max(maxDepth(node.left)+1,maxDepth(node.right)+1);
    }
}
