package Lec47;

import java.util.*;

public class Replace_Words {

	class Trie {
		class Node {
			char ch;
			String isterminal;
			HashMap<Character, Node> child;

			public Node(char ch) {
				// TODO Auto-generated constructor stub
				this.ch = ch;
				child = new HashMap<>();
			}
		}

		private Node root;

		public Trie() {
			// TODO Auto-generated constructor stub
			root = new Node('*');
		}

		public void insert(String word) {
			Node curr = root;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
				} else {
					Node nn = new Node(ch);
					curr.child.put(ch, nn);
					curr = nn;
				}

			}
			curr.isterminal = word;

		}

		public String replaced(String s) {
			Node curr = root;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
					if (curr.isterminal != null) {
						return curr.isterminal;
					}
				} else {
					return s;
				}
			}
			return s;

		}
	}

	class Solution {
		public String replaceWords(List<String> dictionary, String sentence) {
			String[] arr = sentence.split(" ");
			Trie t = new Trie();
			for (String s : dictionary) {
				t.insert(s);
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				String s = t.replaced(arr[i]);
				sb.append(s + " ");
			}
			return sb.toString().trim();

		}
	}

}
