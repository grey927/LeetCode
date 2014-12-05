package com.hui.findpeakelement;

/**
 * Description: 
 * A peak element is an element that is greater than its neighbors.
 * 
 * Given an input array where num[i] ¡Ù num[i+1], find a peak element and return
 * its index.
 * 
 * You may imagine that num[-1] = num[n] = -¡Þ.
 * 
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function
 * should return the index number 2.
 * 
 * Note: Your solution should be in logarithmic complexity.
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
public class Solution {

	public int findPeakElement(int[] num) {

		int len = num.length;
		for (int i = 0; i < len; i++) {
			if (0 == i && 1 == len) {
				return i;
			} else if (0 == i && 1 < len) {
				if (num[i] > num[i + 1]) {
					return i;
				}
			} else if (i == len - 1) {
				if (num[i] > num[i - 1]) {
					return i;
				}
			} else if (num[i] > num[i - 1] && num[i] > num[i + 1]) {
				return i;
			}
		}
		return -1;
	}
}
