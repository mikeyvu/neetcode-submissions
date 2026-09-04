class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) {
            return -1;
        }

        int ROWS = grid.length;
        int COLS = grid[0].length;

        boolean[][] visited = new boolean[ROWS][COLS];
        Queue<int[]> queue = new ArrayDeque<>();

        visited[0][0] = true;
        queue.add(new int[]{0,0});

        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {1, -1},
                    {-1, 1}, {-1, - 1}};

        int length = 1;
        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                int[] curr = queue.poll();
                int r = curr[0], c = curr[1];
                if (r == ROWS - 1 && c == COLS - 1) {
                    return length;
                }

                
                for (int[] dir: directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr == ROWS || nc == COLS || nr < 0 || nc < 0) {
                        continue;
                    }

                    if (grid[nr][nc] == 0 && !visited[nr][nc]) {
                        visited[nr][nc] = true;
                        queue.add(new int[]{nr,nc});
                    }
                }
            }
            length++;
        }

        return -1;
    }
}