class Solution {
    private boolean dfs(int node,int col,int[][] graph,int[] color){
        // Queue<Integer> q = new LinkedList<>();
        // q.add(start);
        color[node]=col;
        // while(!q.isEmpty()){
        //     int node = q.peek();
        //     q.remove();
            for(int it:graph[node]){
                if(color[it]==-1){
                    // color[it]=1-color[node];
                    // q.add(it);
                    if(dfs(it,1-col,graph,color)==false) return false;
                }else if(color[it]==color[node]){
                    return false;
                }
            }
        // }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for(int i=0;i<n;i++) color[i]=-1;
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(dfs(i,0,graph,color)==false){
                    return false;
                }
            }
        }
        return true;
    }
}