class Solution {
    public int maxProfit(int[] prices) {
        
        int max_profit = Integer.MIN_VALUE;
        int prev_min = prices[0];

        for(int i=1;i<prices.length;i++){
            max_profit = Math.max(max_profit, prices[i] - prev_min);
            prev_min = Math.min(prices[i], prev_min);
        }

        return((max_profit<0)?0:max_profit);
    }
}