package Lec35;

import java.util.*;

public class Path_Sum_II {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

			List<List<Integer>> ans = new ArrayList<>();
			List<Integer> list = new ArrayList<>();
			HashPath(root, targetSum, list, ans);
			return ans;
		}

		public void HashPath(TreeNode root, int targetSum, List<Integer> list, List<List<Integer>> ans) {

			if (root == null) {
				return;
			}
			if (root.left == null && root.right == null) {
				if (root.val - targetSum == 0) {
					list.add(root.val);
					ans.add(new ArrayList<Integer>(list));
					list.remove(list.size() - 1);
				}
			}
			list.add(root.val);
			HashPath(root.left, targetSum - root.val, list, ans);
			HashPath(root.right, targetSum - root.val, list, ans);
			list.remove(list.size() - 1);

		}

	}
}
