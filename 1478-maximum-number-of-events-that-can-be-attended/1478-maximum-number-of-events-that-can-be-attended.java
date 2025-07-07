class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->a[0]-b[0]);

        int day =0,index=0,n=events.length,res =0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while(!pq.isEmpty()||index<n){
            if(pq.isEmpty()){
                day=events[index][0];
            }
            while(index<n&&events[index][0]<=day){
                pq.offer(events[index][1]);
                index++;
            }
            pq.poll();
            day++;
            res++;
            while(!pq.isEmpty() && pq.peek()<day){
                pq.poll();
            }
        }
        return res;
    }
}