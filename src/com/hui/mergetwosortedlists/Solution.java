package com.hui.mergetwosortedlists;

/**
 * Description: 
 * Merge two sorted linked lists and return it as a new list. The
 * new list should be made by splicing together the nodes of the first two
 * lists.
 * 
 * @author Grey
 * @Email zengh927@163.com
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
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (null == l1) {
			return l2;
		}
		if (null == l2) {
			return l1;
		}

		ListNode dummy = new ListNode(0);
		ListNode head = dummy;
		while (null != l1 && null != l2) {

			if (l1.val > l2.val) {
				head.next = l2;
				l2 = l2.next;
			} else {
				head.next = l1;
				l1 = l1.next;
			}
			head = head.next;
		}

		if (l1 != null) {
			head.next = l1;
		}
		if (l2 != null) {
			head.next = l2;
		}

		return dummy.next;
	}
}