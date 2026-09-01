package Lec46;
import java.util.*;

public class Dijkstra_Algorithm {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public void DijkstraAlgo(int src) {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(src, 0, "" + src));
		while (!pq.isEmpty()) {
			// 1. remove
			DijkstraPair rp = pq.poll();
			// 2. Ignore if Already visited
			if(visited.contains(rp.vtx)) {
				continue;
			}
			// 3. Marked visited
			visited.add(rp.vtx);
			// 4. Self Work
			System.out.println(rp);
			// 5. Add unvisited nbrs
			for(int nbrs:map.get(rp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost=map.get(rp.vtx).get(nbrs);
					pq.add(new DijkstraPair(nbrs, rp.cost+cost, rp.acq_path+nbrs));
				}
			}
		}

	}

	public class DijkstraPair {
		int vtx;
		int cost;
		String acq_path;

		public DijkstraPair(int vtx, int cost, String acq_path) {
			// TODO Auto-generated constructor stub
			this.acq_path = acq_path;
			this.cost = cost;
			this.vtx = vtx;

		}
		@Override
		public String toString() {
			return this.vtx+" "+this.acq_path+" @ "+this.cost;
		}

	}
	public static void main(String[] args) {
		Dijkstra_Algorithm dj = new Dijkstra_Algorithm(7);
		dj.AddEdge(1, 4, 9);
		dj.AddEdge(1, 2, 3);
		dj.AddEdge(2, 3, 1);
		dj.AddEdge(4, 3, 2);
		dj.AddEdge(4, 5, 4);
		dj.AddEdge(5, 6, 1);
		dj.AddEdge(5, 7, 8);
		dj.AddEdge(6, 7, 6);
		dj.DijkstraAlgo(1);
	}

}

















