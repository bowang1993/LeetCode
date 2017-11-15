/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        int a = getNodeNum(headA);
        int b = getNodeNum(headB);
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        if(a>b){
            for(int i=0;i<a-b;i++){
                nodeA = nodeA.next;
            }
        }
        if(b>a){
            for(int i=0;i<b-a;i++){
                nodeB = nodeB.next;
            }
        }
        while(nodeA !=null && nodeB != null){
            if(nodeA == nodeB)
                return nodeA;
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return null;
    }
    public int getNodeNum(ListNode head){
        if(head == null)
            return 0;
        int res = 0;
        while(head!=null){
            res++;
            head = head.next;
        }
        return res;
    }
}
