package com.hui.sametree;

/**
 * Description: Given two binary trees, write a function to check if they are
 * equal or not.
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (null == p && null == q) {
			return true;
		}
		if (null != p && null == q) {
			return false;
		}
		if (null == p && null != q) {
			return false;
		}
		boolean leftSame = false;
		boolean rightSame = false;
		if (null != p && null != q) {
			int pLeftVal = p.val;
			int qLeftVal = q.val;
			int pRightVal = p.val;
			int qRightVal = q.val;
			if ((pLeftVal == qLeftVal) && (pRightVal == qRightVal)) {
				leftSame = isSameTree(p.left, q.left);
				rightSame = isSameTree(p.right, q.right);
				return leftSame && rightSame;
			}

		}
		return false;

	}
}
