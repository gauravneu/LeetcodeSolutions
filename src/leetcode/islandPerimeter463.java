package src.leetcode;

/*
EASY

You are given row x col grid representing a map where
grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally).
The grid is completely surrounded by water, and there is exactly
one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't
connected to the water around the island. One cell is a square
with side length 1. The grid is rectangular, width and
height don't exceed 100. Determine the perimeter of the island.

Example 1:

Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
Output: 16
Explanation: The perimeter is the 16 yellow stripes in the image above.
Example 2:

Input: grid = [[1]]
Output: 4
Example 3:

Input: grid = [[1,0]]
Output: 4

Constraints:

row == grid.length
col == grid[i].length
1 <= row, col <= 100
grid[i][j] is 0 or 1.
There is exactly one island in grid.
 */


public class islandPerimeter463 {
    public int parameter = 0;
    boolean[][] visited;
    int[][] mA = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int islandPerimeter(int[][] grid) {
        visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;
                    calcParameter(grid, i, j);
                }
            }
        }
        return parameter;

    }

    public void calcParameter(int[][] grid, int i, int j) {
        for (int k = 0; k < 4; k++) {
            if (isPossible(grid, i + mA[k][0], j + mA[k][1])) {
                calcParameter(grid, i + mA[k][0], j + mA[k][1]);
            }
        }
    }

    public boolean isPossible(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length) {
            parameter++;
            return false;
        } else if (!visited[i][j] && grid[i][j] == 1) {
            visited[i][j] = true;
            return true;
        } else if (grid[i][j] == 0) {
            parameter++;
            return false;
        } else if (visited[i][j]) {
            return false;
        }

        return false;
    }
}
