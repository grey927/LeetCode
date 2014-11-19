package com.hui.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i = 0; i < numbers.length; i++) {
            hashMap.put(numbers[i],i);
        }
        for (int i = 0; i < numbers.length; i++) {
            Integer one = numbers[i];
            Integer twoIndex = hashMap.get(target - one);
            if (null != twoIndex && twoIndex > i) {
                result[0] = i + 1;
                result[1] = twoIndex + 1;
                break;
            }
        }
        return result;
    }
}
