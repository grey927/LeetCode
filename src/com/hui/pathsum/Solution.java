package com.hui.pathsum;

/**
 * Description:
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum. For
 * example: Given the below binary tree and sum = 22,
 * 
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
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
	public boolean hasPathSum(TreeNode root, int sum) {
		if (null == root) {
			return false;
		}
		return depSum(root, 0, sum);
	}

	public boolean depSum(TreeNode root, int start, int sum) {
		if (null == root.left && null == root.right) {
			if (start + root.val == sum) {
				return true;
			} else {
				return false;
			}
		} else {
			if (null != root.left) {
				boolean leftResult = depSum(root.left, start + root.val, sum);
				if (leftResult) {
					return true;
				}
			}
			if (null != root.right) {
				boolean rightResult = depSum(root.right, start + root.val, sum);
				if (rightResult) {
					return true;
				}
			}
			return false;
		}
	}
}
