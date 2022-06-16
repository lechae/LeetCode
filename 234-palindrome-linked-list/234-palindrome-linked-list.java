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
import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isPalindrome(ListNode head) {
        boolean result = true;
		
		List<Integer> list = new ArrayList<>();
		while(true) {
			list.add(head.val);
			
			if(head.next != null) {
				head = head.next;
			} else break;
		}
		
		int size = list.size();
		for(int i = 0; i < size/2; i++) {
			if(list.get(i) != list.get((size - 1) - i)) {
				result = false;
				break;
			}
		}
		
    	return result;
    }
}