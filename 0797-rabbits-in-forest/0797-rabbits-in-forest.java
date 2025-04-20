class Solution {
    public int numRabbits(int[] answers) {
        int[] hash = new int[1001];
        for(int ans:answers){
            hash[ans]++;
        }
        int ans=0;
        for(int i=0;i<1001;i++){
            if(hash[i]==0) continue;
            ans+=Math.ceil((double)hash[i]/(i+1))*(i+1);
        }
        return ans;
    }
}