package com.hui.insertionsortlist;

/**
 * Description:
 * Sort a linked list using insertion sort.
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
public class Solution {
	public ListNode insertionSortList(ListNode head) {
		if (null == head || null == head.next) {
			return head;
		}
		ListNode dummy = new ListNode(-99);
		ListNode newHead;
		ListNode preNode;
		ListNode nextNode;

		while (null != head) {
			nextNode = head.next;
			preNode = insertPosition(dummy, head.val);
			newHead = preNode.next;
			head.next = newHead;
			preNode.next = head;
			head = nextNode;
		}
		return dummy.next;
	}

	public ListNode insertPosition(ListNode head, int val) {
		ListNode pre = head;
		ListNode next = head.next;
		while (null != next && next.val <= val) {
			pre = next;
			next = next.next;
		}
		return pre;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}