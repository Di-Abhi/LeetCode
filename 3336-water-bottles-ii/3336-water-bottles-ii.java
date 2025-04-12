class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunkBottle=numBottles;
        int emptyBottle=numBottles;
        numBottles=0;
        while(emptyBottle+numBottles>=numExchange){
            // emptyBottles=numBottles;
            emptyBottle-=numExchange;
            numExchange++;
            numBottles++;

        }
        return drunkBottle+numBottles;
    }
}