class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res=numBottles;
        int curr_empty=numBottles;
        while(curr_empty/numExchange!=0){
            int fullDrinked=curr_empty/numExchange;
            int leftEmpty=curr_empty-fullDrinked*numExchange;
            
            res+=fullDrinked;
            curr_empty=leftEmpty+fullDrinked;
        }
        return res;
    }
}