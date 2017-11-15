class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2)
            return 0;
        int yesterday = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>yesterday)
                profit += (prices[i]-yesterday);
            yesterday = prices[i];
        }
        return profit;
    }
}
