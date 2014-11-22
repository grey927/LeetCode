package com.hui.reverseinteger;

/**
 * Description:
 * Reverse digits of an integer.
 * 	Example1: x = 123, return 321
 * 	Example2: x = -123, return -321
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */

public class Solution {
	public int reverse(int x) {

		long result = 0;
		while (0 != x) {
			result = result * 10 + x % 10;
			x = x / 10;
		}

		if (((-1) * result > Integer.MAX_VALUE) || (result > Integer.MAX_VALUE)) {
			return 0;
		}
		return (int) result;

	}
}
