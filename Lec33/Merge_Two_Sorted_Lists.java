package Lec33;

public class Merge_Two_Sorted_Lists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode dummmy = new ListNode();
			ListNode temp = dummmy;
			while (list1 != null && list2 != null) {
				if (list1.val < list2.val) {
					dummmy.next = list1;
					list1 = list1.next;
					dummmy = dummmy.next;
				} else {
					dummmy.next = list2;
					list2 = list2.next;
					dummmy = dummmy.next;
				}
			}
			if (list1 == null) {
				dummmy.next = list2;
			}
			if (list2 == null) {
				dummmy.next = list1;
			}
			return temp.next;

		}
	}

}
