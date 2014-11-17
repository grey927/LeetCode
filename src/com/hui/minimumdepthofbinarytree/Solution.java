package com.hui.minimumdepthofbinarytree;

/**
 * Description: Given a binary tree, find its minimum depth.
 * 
 * The minimum depth is the number of nodes along the shortest path from the
 * root node down to the nearest leaf node.
 * 
 * @author Grey
 * @Email zengh927@163.com
 *
 */
public class Solution {
	public int minDepth(TreeNode root) {
		if (null == root) {
			return 0;
		} else {
			if (null == root.left) {
				return minDepth(root.right) + 1;
			}
			if (null == root.right) {
				return minDepth(root.left) + 1;
			}
			int i = minDepth(root.left);
			int j = minDepth(root.right);
			return (i >= j ? j : i) + 1;
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
