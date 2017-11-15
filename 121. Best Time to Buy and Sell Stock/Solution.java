class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int minPrice = prices[0];
        int maxPro = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] - minPrice > maxPro)
                maxPro = prices[i] - minPrice;
            if(prices[i] < minPrice)
                minPrice = prices[i]; 
        }
        return maxPro;
    }
}
