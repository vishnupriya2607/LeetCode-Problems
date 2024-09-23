/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int t=0;
        while(temp!=null)
        {
            temp=temp.next;
            t++;
        }
        t=(t)/2;
        while(t>0)
        {
            head=head.next;
            t--;
        }
        return head;
    }
}