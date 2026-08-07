package Lec36;

public class BinarySearchTree {
	private class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node root;

	public BinarySearchTree(int[] in) {
		// TODO Auto-generated constructor stub
		root = CreateTree(in, 0, in.length - 1);
	}

	private Node CreateTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node node = new Node(in[mid]);
		node.left = CreateTree(in, si, mid - 1);
		node.right = CreateTree(in, mid + 1, ei);
		return node;
	}

}
