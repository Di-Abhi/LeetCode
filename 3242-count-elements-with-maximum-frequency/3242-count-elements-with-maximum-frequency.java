class Solution {
    public int maxFrequencyElements(int[] nums) {
        // HashMap<Integer,Integer> mpp = new HashMap<>();
        int[] freq = new int[101];
        for(int num:nums){
            freq[num]++;
        }
        int maxFreq=0;
        for(int i=0;i<101;i++){
            maxFreq=Math.max(freq[i],maxFreq);
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(freq[i]==maxFreq) sum+=freq[i];
        }
        return sum;

    }
}