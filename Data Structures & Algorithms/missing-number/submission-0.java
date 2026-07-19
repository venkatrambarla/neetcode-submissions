class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> missingNumber=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            missingNumber.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++)
        {
            if(!missingNumber.contains(i))
            {
return i;
            }
        }
return nums.length;
    }
}
