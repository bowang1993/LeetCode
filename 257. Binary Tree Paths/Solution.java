import java.util.*;
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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        if(root == null)
            return list;
        binaryTreePaths("",root,list);
        return list;
    }
    public void binaryTreePaths(String str, TreeNode node, ArrayList<String> list){        
        if(node.left == null && node.right == null){
            list.add(str+node.val);
            return;
        }
        if(node.left != null){
            binaryTreePaths(str + node.val+ "->" , node.left ,list);
        }
        if(node.right != null){
            binaryTreePaths(str + node.val+ "->" , node.right ,list);
        }
    }
}
