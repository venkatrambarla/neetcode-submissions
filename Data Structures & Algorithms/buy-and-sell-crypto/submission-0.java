class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        if(n<=0) return 0;
        for(int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                int tempProfit=prices[j]-prices[i];
                if(tempProfit>profit) profit=tempProfit;
            }
        }
        return profit;
        
    }
}
