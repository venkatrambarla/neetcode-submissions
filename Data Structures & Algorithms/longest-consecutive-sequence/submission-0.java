class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet=new HashSet<Integer>();
        int res=0;
        for(int num:nums)
        {
            numSet.add(num);
        }
        System.out.println("numSet"+numSet);

        for(int num: nums)
        {
            int streak=0, curr=num;
            while(numSet.contains(curr)){
                streak++;
                curr++;
            }
            res=Math.max(res, streak);
        }
        return res;
        
    }
}
