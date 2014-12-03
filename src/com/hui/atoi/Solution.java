package com.hui.atoi;

/**
 * Description:
 * String to Integer (atoi) 
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
public class Solution {
    public int atoi(String str) {
       if (null == str || 0 == str.trim().length()) {
           return 0;
       }
       str = str.trim();
       char flag = '+';
     
       int i = 0;
       if (str.charAt(0) == '-') {
         flag = '-';
         i++;
       } else if (str.charAt(0) == '+') {
         i++;
       }

       double result = 0.0;
 
       while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
           result = result * 10 + (str.charAt(i) - '0');
           i++;
       }
 
      if (flag == '-') {
          result = -result;
      }
      if (result > Integer.MAX_VALUE) {
         return Integer.MAX_VALUE;
      }
      if (result < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      return (int) result;
    }
}
