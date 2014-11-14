package com.hui.removeelement;

/**
 * Description:
 * Given an array and a value, remove all instances of that value in place and
 * return the new length. The order of elements can be changed. 
 * It doesn't matter what you leave beyond the new length.
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */

public class Solution {
	public int removeElement(int[] A, int elem) {
		int end = A.length - 1;
		int begin = 0;
		int count = 0;
		while (begin <= end) {
			if (elem != A[begin]) {
				count++;
				begin++;
			} else {
				if (A[end] != elem) {
					A[begin] = A[end];
					A[end] = elem;
					end--;
					begin++;
					count++;
				} else {
					end--;
				}

			}
		}
		return count;
	}
}