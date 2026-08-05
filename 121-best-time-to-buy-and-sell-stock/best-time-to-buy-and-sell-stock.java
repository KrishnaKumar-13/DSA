class Solution {
    public int maxProfit(int[] prices) {
        /*int max =0;
        for(int i = 0;i<prices.length;i++)
        {
            for(int j =i+i;j<prices.length;j++)
            {
                int profit = prices[j] - prices[i];
                max = Math.max(profit,max);
            }
        }
        return max; */

        // brute force approach ;
        int maxvalue =0;
        int minvalue = prices[0];
        for(int i = 1;i<prices.length;i++)
        {
            if(prices[i]<minvalue)
            {
                minvalue = prices[i];
            }
            else
            {
                maxvalue = Math.max(maxvalue,prices[i] - minvalue);
            }
        }
      return maxvalue;  
    }
}