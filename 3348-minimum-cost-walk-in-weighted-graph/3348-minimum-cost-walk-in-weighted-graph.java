class DSU{
    int rank[];
    int parent[];
    DSU(int n){
        rank=new int[n];
        parent=new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
    public int find(int node){
        if(node==parent[node]){
            return node;
        }
        parent[node]=find(parent[node]);
        return parent[node];
    }
    public void union(int node1,int node2){
        int rootnode1=find(node1);
        int rootnode2=find(node2);
        if(rootnode1==rootnode2){
            return;
        }
        if(rank[rootnode1]<rank[rootnode2]){
            parent[rootnode1]=rootnode2;
        }else if(rank[rootnode2]<rank[rootnode1]){
            parent[rootnode2]=rootnode1;
        }else{
            parent[rootnode1]=rootnode2;
            rank[rootnode1]++;
        }
    }
}
class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        DSU dsu=new DSU(n);
        for(int edge[]:edges){
            dsu.union(edge[0],edge[1]);
        }
        int cmtCost[] = new int[n];
        Arrays.fill(cmtCost,Integer.MAX_VALUE);
        for(int edge[]:edges){
            int rootParent=dsu.find(edge[0]);
            cmtCost[rootParent]=cmtCost[rootParent]&edge[2];
        }
        int m=query.length;
        int res[] = new int[m];
        for(int i=0;i<m;i++){
            int rootParent1=dsu.find(query[i][0]);
            int rootParent2=dsu.find(query[i][1]);
            if(rootParent1!=rootParent2){
                res[i]=-1;
            }
            else{
                res[i]=cmtCost[rootParent1];
            }
        }
        return res;
    }
}