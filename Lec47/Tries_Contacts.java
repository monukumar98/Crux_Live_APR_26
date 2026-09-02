package Lec47;

import java.util.HashMap;

import Lec47.Trie.Node;

public class Tries_Contacts {
	class Node {
		char ch;
		boolean isterminal;
		HashMap<Character, Node> child;
		int count;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
			child = new HashMap<>();
			count=1;
		}
	}

	private Node root;

	public Tries_Contacts() {
		// TODO Auto-generated constructor stub
		root = new Node('*');
	}
	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.count++;
			} else {
				Node nn = new Node(ch);
				curr.child.put(ch, nn);
				curr = nn;
			}

		}
		curr.isterminal = true;
	}
	public int search(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}

		}
		return curr.count;
	}

}
