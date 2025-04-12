class Solution {
    public boolean isSym(int num){
        int num1=num;
        int n=0;
        while(num1>0){
            num1/=10;
            n++;
        }
        if(n%2!=0){
            return false;
        }
        int n1=n/2,n2=n/2;
        int sum1 =0;
        while(n2>0){
            sum1+=num%10;
            num=num/10;
            n2--;
        }
        int sum2=0;
        while(n1>0){
            sum2+=num%10;
            num=num/10;
            n1--;
        }
        if(sum1==sum2){
            return true;
        }
        return false;
    }
    public int countSymmetricIntegers(int low, int high) {
        // int n=0;
        int cnt=0;
        for(int i=low;i<=high;i++){
            if(isSym(i)){
                cnt++;
            }
        }
        return cnt;
    }
}