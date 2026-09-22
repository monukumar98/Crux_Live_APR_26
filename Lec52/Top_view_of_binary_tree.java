package Lec52;

import java.util.*;

public class Top_view_of_binary_tree {

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
		public List<Integer> TopView(TreeNode root) {
			List<Integer> ll = new ArrayList<>();
			TreeMap<Integer, Integer> map = new TreeMap<>();
			TopView(root, 0, map);
			for(int key:map.keySet()) {
				ll.add(map.get(key));
			}
			return ll;
		}

		public void TopView(TreeNode root, int vl, TreeMap<Integer, Integer> map) {
			if (root == null) {
				return;
			}

			if (!map.containsKey(vl)) {
				map.put(vl, root.val);
			}
			TopView(root.left, vl - 1, map);
			TopView(root.right, vl + 1, map);

		}
	}

}
