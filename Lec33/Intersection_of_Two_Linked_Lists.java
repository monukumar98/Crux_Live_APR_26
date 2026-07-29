package Lec33;

public class Intersection_of_Two_Linked_Lists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode rohit = headA;
			ListNode vgf = headB;
			while (rohit != vgf) {
				if (rohit == null) {
					rohit = headB;
				} else {
					rohit = rohit.next;
				}
				if (vgf == null) {
					vgf = headA;
				} else {
					vgf = vgf.next;
				}
			}
			return vgf;

		}
	}

}
