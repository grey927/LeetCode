package com.hui.removeduplicatesfromsortedlist;

/**
 * Description: Given a sorted linked list, delete all duplicates such that each
 * element appear only once. 
 * For example, 
 * Given 1->1->2, return 1->2. 
 * Given 1->1->2->3->3, return 1->2->3.
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
	public ListNode deleteDuplicates(ListNode head) {
		if (null == head) {
			return null;
		}
		if (null != head && null == head.next) {
			return head;
		}
		ListNode oriHead = head;

		while (null != head.next) {
			int preVal = head.val;
			int nextVal = head.next.val;
			if (preVal == nextVal) {
				head.next = head.next.next;
			} else {
				head = head.next;
			}
		}
		return oriHead;
	}
}