class Solution {
    private void bfs(int[][] heights, Queue<int[]> q, boolean[][] vis) {
        int m = heights.length, n = heights[0].length;
        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            for (int[] d : dir) {
                int nr = r + d[0], nc = c + d[1];
                if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                    continue;
                if (vis[nr][nc])
                    continue;
                if (heights[nr][nc] < heights[r][c])
                    continue;
                vis[nr][nc] = true;
                q.offer(new int[] { nr, nc });
            }
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0)
            return res;
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pac = new boolean[m][n];
        boolean[][] atl = new boolean[m][n];

        Queue<int[]> q = new LinkedList<>();
        Queue<int[]> q2 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new int[] { 0, i });
            pac[0][i] = true;
            q2.offer(new int[] { m - 1, i });
            atl[m - 1][i] = true;
        }
        for (int i = 0; i < m; i++) {
            q.offer(new int[] { i, 0 });
            pac[i][0] = true;
            q2.offer(new int[] { i, n - 1 });
            atl[i][n - 1] = true;
        }
        bfs(heights, q, pac);
        bfs(heights, q2, atl);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pac[i][j] && atl[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }
}