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
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        toString(sb1,p);
        toString(sb2,q);
        if(sb1.toString().equals(sb2.toString())){
            return true;
        }
        return false;
    }
    
    public static void toString(StringBuffer sb, TreeNode p){
        if(p == null){
            sb.append("#%");
            return;
        }
        sb.append( p.val + "%");
        toString(sb,p.left);
        toString(sb,p.right);
    }
    
}
