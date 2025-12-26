class Solution {
    public int bestClosingTime(String customers) {
        int size = customers.length();
        int[] ct= new int[size+1];
        int cntN=0;
        int cntY=0;
        for(int i=0;i<size;i++){
            if(customers.charAt(i)=='Y'){
                cntY++;
            }else{
                cntN++;
            }
        }
        if(cntY==0){
            return 0;
        }else if(cntN==0){
            return cntY;
        }
        ct[0]=cntY;
        int n=0;
        for(int i=1;i<size+1;i++){
            if(customers.charAt(i-1)=='Y'){
                if(n==0){
                    ct[i]=--cntY;
                }else{
                    ct[i]=--cntY+n;
                }
            }else if(customers.charAt(i-1)=='N'){
                n++;
                ct[i]=cntY+n;
            }
        }
        int ans=size;
        int min=size;
        for(int i=0;i<=size;i++){
            min=Math.min(ct[i],min);
        } 
        for(int i=0;i<=size;i++){
            if(min==ct[i]){
                ans=i;
                break;
            }
        }
        return ans;     
    }
}