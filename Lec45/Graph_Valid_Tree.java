package Lec45;

import java.util.*;

public class Graph_Valid_Tree {

	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int i = 0; i < edges.length; i++) {// row
				int a = edges[i][0];
				int b = edges[i][1];
				map.get(a).add(b);
				map.get(b).add(a);
			}
			return BFT(map);
		}

		public boolean BFT(HashMap<Integer, List<Integer>> map) {
			Queue<Integer> q = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			int c = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				c++;
				// BFS
				q.add(src);
				while (!q.isEmpty()) {
					// 1. remove
					int r = q.poll();
					// 2. Ignore if Already visited
					if (visited.contains(r)) {
						return false;// cycle
					}
					// 3. Marked visted
					visited.add(r);
					// 4. Self work
					// System.out.print(r + " ");
					// Add unvisited nbrs
					for (int nbrs : map.get(r)) {
						if (!visited.contains(nbrs)) {
							q.add(nbrs);
						}
					}
				}
			}
			return c == 1;
		}

	}

}
