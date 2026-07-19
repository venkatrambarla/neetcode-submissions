class Solution {
    public boolean isPalindrome(String s) {
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] schar=filtered.toCharArray();
        int n=schar.length;
        if(n<=0) return true;
        for(int i=0;i<n/2;i++){

            if (schar[i]==schar[n-1-i])
            continue;
            else
            return false;
        }
        return true;
        
    }
}

