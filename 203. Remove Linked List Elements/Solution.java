/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!= null &&  head.val == val){
            head = head.next;
        }
        if(head == null)
            return null;
        ListNode pre = head;
        ListNode tmp = head.next;
        while(tmp!=null){
            if(tmp.val == val){
                pre.next = tmp.next;
                tmp = tmp.next;
                continue;
            }
            pre = tmp;
            tmp = tmp.next;
        }
        return head;
    }
}
