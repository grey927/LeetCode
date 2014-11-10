package com.hui.singlenum;

/**
 * Description: Given an array of integers, every element appears twice except
 * for one. Find that single one.
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
public class Solution {
	public int singleNumber(int[] A) {
		for (int i = 1; i < A.length; i++) {
			A[i] = A[i - 1] ^ A[i];
		}
		return A[A.length - 1];
	}
}
