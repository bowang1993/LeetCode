/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next != null)
            fast = fast.next;
        ListNode head2 = slow.next;
        slow.next = null;
        ListNode headLeft = head;
        ListNode headRight = reverseList(head2);
        while(headLeft != null && headRight != null){
            if(headLeft.val != headRight.val){
                return false;
            }
            headLeft = headLeft.next;
            headRight = headRight.next;
        }
        return true;
        
    }
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode pre = head;
        ListNode cur = head.next;
        pre.next = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
