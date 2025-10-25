class Solution {
    public int totalMoney(int n) {
        int money = 0;
        int weeks = n/7;
        int rmDays = n%7;

        for(int i=0;i<n/7;i++){
            for(int k=1;k<=7;k++){
                money+=k+i;
            }
        }
        if(n%7!=0){
        for(int i=1;i<=n%7;i++){
            money+=(i+n/7);
        }
        }
        return money;
    }
}