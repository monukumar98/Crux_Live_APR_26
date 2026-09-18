package Lec51;

import java.util.Arrays;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Minimum_Path(grid, 0, 0, grid.length - 1, grid[0].length - 1, dp));

	}

	public static int Minimum_Path(int[][] grid, int cr, int cc, int er, int ec, int[][] dp) {
		if (cr == er && cc == ec) {
			return grid[cr][cc];
		}
		if (cr > er || cc > ec) {
			return Integer.MAX_VALUE;
		}
		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
		int left = Minimum_Path(grid, cr, cc + 1, er, ec, dp);
		int down = Minimum_Path(grid, cr + 1, cc, er, ec, dp);
		return dp[cr][cc] = Math.min(left, down) + grid[cr][cc];

	}

}
