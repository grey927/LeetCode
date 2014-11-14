package com.hui.linkedlistcycle;

/**
 * Description: Given a linked list, determine if it has a cycle in it. 
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
	public boolean hasCycle(ListNode head) {
		if (null == head) {
			return false;
		}

		ListNode tHead = head;
		while (null != head.next) {
			if (tHead == head.next) {
				return true;
			}
			ListNode temp = head.next;
			head.next = tHead;
			head = temp;
		}
		return false;
	}
}