class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int bulb:bulbs){
            freq.put(bulb,freq.getOrDefault(bulb,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<bulbs.size();i++){
            int times = freq.get(bulbs.get(i));
            if(times%2!=0){
                if(!ans.contains(bulbs.get(i))){
                    ans.add(bulbs.get(i));
                }
            } 
        }
        Collections.sort(ans);
        return ans;
    }
}