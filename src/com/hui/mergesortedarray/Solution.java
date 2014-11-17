package com.hui.mergesortedarray;

/**
 * Description: 
 * Given two sorted integer arrays A and B, merge B into A as one
 * sorted array.
 * 
 * Note: You may assume that A has enough space (size that is greater or equal
 * to m + n) to hold additional elements from B. The number of elements
 * initialized in A and B are m and n respectively.
 * 
 * @author Grey
 * @Email zengh927@163.com
 */
public class Solution {
	public void merge(int A[], int m, int B[], int n) {
		int pa = m - 1;
		int pb = n - 1;
		int p = m + n - 1;
		while (pa >= 0 && pb >= 0) {
			if (A[pa] > B[pb]) {
				A[p] = A[pa];
				pa--;
			} else {
				A[p] = B[pb];
				pb--;
			}
			p--;
		}
		while (pa >= 0) {
			A[p] = A[pa];
			pa--;
			p--;
		}
		while (pb >= 0) {
			A[p] = B[pb];
			pb--;
			p--;
		}
	}
}
