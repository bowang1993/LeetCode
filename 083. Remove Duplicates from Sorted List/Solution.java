/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode resHead = head;
        ListNode tmpNode = head.next;
        ListNode preNode = head;
        while(tmpNode != null){
            if(tmpNode.val == preNode.val){
                preNode.next = tmpNode.next;
                tmpNode = tmpNode.next;
            }else{
                preNode = tmpNode;
                tmpNode = tmpNode.next;
            }
        }
        return resHead;
    }
}
