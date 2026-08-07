package Lec36;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Tree_Using_Level_Order {
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
	public Create_Tree_Using_Level_Order() {
		// TODO Auto-generated constructor stub
		CrateTree();
	}
	private void CrateTree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Node> q = new LinkedList<>();
		int x=sc.nextInt();
		Node nn = new Node(x);
		root=nn;
		q.add(nn);
		while(!q.isEmpty()) {
			Node r=q.poll();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node n = new Node(c1);
				r.left=n;
				q.add(n);
			}
			if(c2!=-1) {
				Node n = new Node(c1);
				r.right=n;
				q.add(n);
			}
		}
				
		
	}
	

}













