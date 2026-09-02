package Lec47;

import java.util.*;

public class Rotting_Oranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		System.out.println(oranges_Rotting(grid));

	}

	public static int oranges_Rotting(int[][] grid) {
		Queue<int[]> q = new LinkedList<>();
		int fresh_orange = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					fresh_orange++;
				} else if (grid[i][j] == 2) {
					q.add(new int[] { i, j });
				}
			}
		}
		//System.out.println(q.size() + " " + fresh_orange);
		int[] r = { -1, 0, 1, 0 };
		int[] c = { 0, -1, 0, 1 };
		int minutes = 0;
		while (!q.isEmpty() && fresh_orange > 0) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int[] a = q.poll();
				for (int j = 0; j < 4; j++) {
					int new_row = a[0] + r[j];
					int new_col = a[1] + c[j];
					if (new_row >= 0 && new_col >= 0 && new_row < grid.length && new_col < grid[0].length
							&& grid[new_row][new_col] == 1) {
						grid[new_row][new_col] = 2;
						fresh_orange--;
						q.add(new int[] { new_row, new_col });

					}
				}

			}

			minutes++;
			//System.out.println(minutes + " " + q.size());

		}
		//System.out.println(minutes);
		return fresh_orange > 0 ? -1 : minutes;

	}

}
