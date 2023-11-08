package medium;

public class NumberOfIslands {

    /**
     * 3 ms, 47.15 MB
     */
    public int numIslands(char[][] grid) {
        int result = 0;
        byte[][] visited = new byte[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    bfs(grid, i, j, visited);
                    result++;
                }
            }
        }
        return result;
    }

    private void bfs(char[][] grid, int i, int j, byte[][] visited) {
        if (i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length ||
            grid[i][j] == '0' || visited[i][j] == 1
        ) {
            return;
        }
        visited[i][j] = 1;
        bfs(grid, i - 1, j, visited);
        bfs(grid, i + 1, j, visited);
        bfs(grid, i, j - 1, visited);
        bfs(grid, i, j + 1, visited);
    }

    /**
     * 3 ms, 47.03 MB
     */
    public int numIslands1(char[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }

    private void bfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        bfs(grid, i - 1, j);
        bfs(grid, i + 1, j);
        bfs(grid, i, j - 1);
        bfs(grid, i, j + 1);
    }
}
