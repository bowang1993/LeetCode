/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
        if(root == null){
            return list;
        }
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        TreeNode last = root;
        TreeNode nlast = null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            list2.offer(tmp.val);
            if(tmp.left != null){
                queue.offer(tmp.left);
                nlast = tmp.left;
            }
            if(tmp.right != null){
                queue.offer(tmp.right);
                nlast = tmp.right;
            }
            if(tmp == last){
                list.push(list2);
                list2 = new LinkedList<>();
                last = nlast;
            }
        }
        return list;
    }
}
