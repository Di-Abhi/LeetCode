class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // build graph: edge from prereq -> course
        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];
            adj.get(prereq).add(course);
        }

        // indegree array
        int[] indeg = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int it : adj.get(i)) {
                indeg[it]++;
            }
        }

        // queue for BFS
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) q.add(i);
        }

        int[] topo = new int[numCourses];
        int idx = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            topo[idx++] = node;

            for (int it : adj.get(node)) {
                indeg[it]--;
                if (indeg[it] == 0) q.add(it);
            }
        }

        // if not all courses are taken, cycle exists → return empty
        if (idx != numCourses) return new int[0];
        return topo;
    }
}
