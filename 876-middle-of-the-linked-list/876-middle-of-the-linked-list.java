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
        ListNode result = head;
		
		//length
		int pos = 1;
		while(head.next != null) {
			pos++;
			head = head.next;
		}
		pos /= 2;
		
		while(pos-- != 0) {
			result = result.next;
		}
		
    	return result;
    }
}