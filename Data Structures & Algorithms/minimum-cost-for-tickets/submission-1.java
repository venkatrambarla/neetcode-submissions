class Solution {
    private int[] dp;
    public int mincostTickets(int[] days, int[] costs) {
        dp=new int[days.length];
        Arrays.fill(dp,-1);
        return dfs(days,costs,0);
    }

    private int dfs(int[] days,int[] costs, int i)
    {
    
        if(i==days.length) return 0;
        if(dp[i]!=-1) return dp[i];

        dp[i]=Integer.MAX_VALUE;
        
        dp[i]=costs[0] + dfs(days,costs,i+1);
        int j=i;
        while(j<days.length && days[j]< days[i]+7)
        {
            j++;
        }
        dp[i]=Math.min(dp[i], costs[1] + dfs(days,costs,j));
        j=i;
        while(j<days.length && days[j]< days[i]+30)
        {
            j++;
        }
        dp[i]=Math.min(dp[i], costs[2]+dfs(days,costs,j));
        
        return dp[i];
    }
}