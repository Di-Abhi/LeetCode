class Solution {
    public int countLargestGroup(int n) {
        int count[] = new int[40];
        int cnt=0;
        int size=0;
        for(int i=1;i<=n;i++){
            int digitSum=0;
            for(int x=i;x>0;x/=10){
                digitSum+=x%10;
            }
            ++count[digitSum];
            if(size<count[digitSum]){
                size=count[digitSum];
                cnt=1;
            }else if(size==count[digitSum]){
                ++cnt;
            }
        }
        return cnt;
    }
}