package com.hui.validpalindrome;

/**
 * Description: Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
public class Solution {
	public boolean isPalindrome(String s) {
		if (null == s || "".equals(s.trim())) {
			return true;
		}

		char[] strArray = s.toCharArray();
		int i = 0;
		int j = strArray.length - 1;
		while (i < j) {
			if (!checkValidate(strArray[i])) {
				i++;
				continue;
			}
			if (!checkValidate(strArray[j])) {
				j--;
				continue;
			}

			if (!checkEqual(strArray[i], strArray[j])) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		if (i >= j) {
			return true;
		}
		return false;
	}

	public static boolean checkValidate(char c1) {
		if (('a' <= c1 && c1 <= 'z') || ('A' <= c1 && c1 <= 'Z')
				|| ('0' <= c1 && c1 <= '9')) {
			return true;
		}
		return false;
	}

	public static boolean checkEqual(char c1, char c2) {
		if (c1 == c2) {
			return true;
		}
		if (('a' <= c1 && c1 <= 'z') && ('A' <= c2 && c2 <= 'Z')
				&& (c1 - 'a' == c2 - 'A')) {
			return true;
		}
		if (('A' <= c1 && c1 <= 'Z') && ('a' <= c2 && c2 <= 'z')
				&& (c1 - 'A' == c2 - 'a')) {
			return true;
		}
		return false;
	}
}
