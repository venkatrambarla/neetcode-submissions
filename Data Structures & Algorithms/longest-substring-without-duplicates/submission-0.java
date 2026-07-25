class Solution {
    public int lengthOfLongestSubstring(String s) {

        char[] sChars=s.toCharArray();
        int i=0,counter=0,maxCounter=0, left=0;
        Set<Character> charSet=new HashSet<Character>();
        while(counter<sChars.length && left<sChars.length)
        {
            if(!charSet.contains(sChars[counter]))
            {

                charSet.add(sChars[counter]);
                
                counter++;
                maxCounter=Math.max(maxCounter,counter-left);
            }
            else {
                charSet.remove(sChars[left]);
                left++;
            }
         
        }

        return maxCounter;
    }
}
