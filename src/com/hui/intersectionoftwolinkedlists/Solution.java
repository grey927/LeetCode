package com.hui.intersectionoftwolinkedlists;


/**Description:
 * Write a program to find the node at which the intersection of two singly linked lists begins.


	For example, the following two linked lists:
		A:	       	a1 ¡ú a2
                   			¨K
                     		c1 ¡ú c2 ¡ú c3
                   			¨J            
        B:     b1 ¡ú b2 ¡ú b3
	begin to intersect at node c1.
	
	
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
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (null == headA || null == headB) {
			return null;
		}
		if (null == headA.next && null == headB.next) {
			if (headA.val == headB.val) {
				return headA;
			} else {
				return null;
			}
		}
		int countA = getLength(headA);
		int countB = getLength(headB);

		if (countA == countB) {
			while (null != headA && null != headB) {
				if (null != headB && null != headA && headA.next == headB.next
						&& headA.val == headB.val) {
					return headA;
				}
				headA = headA.next;
				headB = headB.next;
			}
			return null;
		} else {
			if (countA > countB) {
				int n = countA - countB;
				while (n != 0) {
					headA = headA.next;
					n--;
				}
				while (null != headA && null != headB) {

					if (null != headB && null != headA
							&& headA.next == headB.next
							&& headA.val == headB.val) {
						return headA;
					}
					if (null == headA.next && null == headB.next) {
						if (headA.val == headB.val) {
							return headA;
						} else {
							return null;
						}
					}
					headA = headA.next;
					headB = headB.next;
				}
				return null;
			} else {
				int n = countB - countA;
				while (n != 0) {
					headB = headB.next;
					n--;
				}
				while (null != headA && null != headB) {

					if (null != headB && null != headA
							&& headA.next == headB.next
							&& headA.val == headB.val) {
						return headA;
					}
					if (null == headA.next && null == headB.next) {
						if (headA.val == headB.val) {
							return headA;
						} else {
							return null;
						}
					}
					headA = headA.next;
					headB = headB.next;
				}
				return null;
			}

		}

	}

	private int getLength(ListNode head) {
		int count = 0;
		while (null != head) {
			head = head.next;
			count++;
		}
		return count;
	}
}