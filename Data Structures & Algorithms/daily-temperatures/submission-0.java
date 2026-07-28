class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        int left=0, right=0;
        int n=temperatures.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(temperatures[j]>temperatures[i])
                {
                    res[i]=j-i;
                    break;
                }
            }
        }
        return res;
    }
}
