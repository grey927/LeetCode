package com.hui.linkedlistcycleii;



/**
 * Description: 
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * Follow up:
 * Can you solve it without using extra space?
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class Solution {
	public ListNode detectCycle(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode quick = head;
		ListNode slow = head;

		boolean flag = false;
		while (null != quick && null != quick.next) {
			quick = quick.next;
			quick = quick.next;
			slow = slow.next;
			if (quick == slow) {
				flag = true;
				break;
			}
		}

		if (flag == false) {
			return null;
		} else {
			quick = head;
			while (true) {
				if (quick == slow) {
					return quick;
				} else {
					quick = quick.next;
					slow = slow.next;
				}
			}
		}
	}
}
