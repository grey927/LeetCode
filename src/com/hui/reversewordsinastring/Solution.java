package com.hui.reversewordsinastring;

/**
 * Description: Given an input string, reverse the string word by word. For
 * example, Given s = "the sky is blue", return "blue is sky the".
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
public class Solution {
	public String reverseWords(String s) {
        if (null == s) {
            return null;
        }
        if ("".equals(s.trim())) {
            return "";
        }
        String trimStr = s.trim();
        String word = "";
        String reverseStr = "";
        boolean spaceFlag = true;
        for (int i = 0; i < trimStr.length(); i++) {
        	char c = trimStr.charAt(i);
        	if (c != ' ') {
        		word += c;
        		spaceFlag = false;
        	} else {       		
        		if (spaceFlag) {
            		continue;
            	} else {
            		reverseStr =" "+ word + reverseStr ;
            		spaceFlag = true;
            		word = "";
            	}
        	}
        }
        reverseStr = word+reverseStr;
        return reverseStr.trim();
       
    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.reverseWords("blue is sky the"));
	}
}
