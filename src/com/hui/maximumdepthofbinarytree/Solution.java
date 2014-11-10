package com.hui.maximumdepthofbinarytree;

/**
 * Description: Given a binary tree, find its maximum depth.
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */

public class Solution {
	public int maxDepth(TreeNode root) {
		if (null == root) {
			return 0;
		} else {
			int i = maxDepth(root.left);
			int j = maxDepth(root.right);
			return (i >= j ? i : j) + 1;
		}
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
