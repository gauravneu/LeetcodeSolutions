package src.leetcode;

public class islandPerimeter463 {
    boolean[][] visited;
    int[][] mA = {{0,1},{0,-1},{1,0},{-1,0}};
    public int parameter = 0;
    public int islandPerimeter(int[][] grid) {
        visited = new boolean[grid.length][grid[0].length];

        for(int i = 0 ; i< grid.length; i++){
            for(int j =0 ; j< grid[0].length; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    visited[i][j] = true;
                    calcParameter(grid, i ,j);
                }
            }
        }
        return parameter;

    }

    public void calcParameter(int[][] grid, int i, int j){
        for(int k = 0; k < 4; k++){
            if(isPossible(grid, i+mA[k][0],j+mA[k][1])){
                calcParameter(grid, i+mA[k][0],j+mA[k][1]);
            }
        }
    }

    public boolean isPossible(int[][] grid, int i , int j){
        if(i < 0 || j < 0 || i == grid.length || j == grid[0].length){
            parameter++;
            return false;
        }
        else if(!visited[i][j] && grid[i][j] == 1){
            visited[i][j] = true;
            return true;
        }
        else if(grid[i][j] == 0){
            parameter++;
            return false;
        }
        else if(visited[i][j]){
            return false;
        }

        return false;
    }
}
