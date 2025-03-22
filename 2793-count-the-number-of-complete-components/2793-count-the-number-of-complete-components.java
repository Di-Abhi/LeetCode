class DSU{
    int parent[];
    int size[];

    DSU(int n){
        parent=new int[n];
        size= new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
        }

        Arrays.fill(size,1);
    }

    public int find(int node){
        if(parent[node]==node){
            return node;
        }
        parent[node]=find(parent[node]);
        return parent[node];
    }

    public void union(int node1,int node2){
        int rootParent1=find(node1);
        int rootParent2=find(node2);

        if(rootParent1==rootParent2){
            return;
        }
        else if(size[rootParent1]>size[rootParent2]){
            parent[rootParent2]=rootParent1;
            size[rootParent1]+=size[rootParent2];
        }
        else{
            parent[rootParent1]=rootParent2;
            size[rootParent2]+=size[rootParent1];
        }
    }
}
class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        DSU dsu = new DSU(n);
        Map<Integer,Integer> edgeCount = new HashMap<>();
        for(int[] edge:edges){
            dsu.union(edge[0],edge[1]);
        }
        for(int[] edge:edges){
            int root= dsu.find(edge[0]);
            edgeCount.put(root, edgeCount.getOrDefault(root,0)+1);
        }
        int completeCnt=0;
        for(int vertex=0;vertex<n;vertex++){
            if(dsu.find(vertex)==vertex){
                int nodeCnt = dsu.size[vertex];
                int expEdge=nodeCnt*(nodeCnt-1)/2;
                if(edgeCount.getOrDefault(vertex,0)==expEdge){
                    completeCnt++;
                }
            }
        }
        return completeCnt;
    }
}