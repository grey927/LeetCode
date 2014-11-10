package com.hui.maximumsubarray;

/**
 * Description: 
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
public class Solution {
    public int maxSubArray(int[] A) {
        if (1 == A.length) {
            return A[0];
        }
        int sum = A[0];
        int max = A[0];
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
            if (sum < A[i]) {
                sum = A[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
