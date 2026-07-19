class Solution {
    public boolean isAnagram(String s, String t) {
       char[] sChar=s.toCharArray();
       char[] tChar=t.toCharArray();
       int slen=s.length();
        int tlen=t.length();
        if (slen!=tlen) return false;
        int sCounter=1,tCounter=0;
        HashMap<Character, Integer> sCountMap=new HashMap();
        HashMap<Character, Integer> tCountMap=new HashMap();
        for (char c : s.toCharArray()) {
            sCountMap.put(c, sCountMap.getOrDefault(c, 0) + 1);           // Update count
        }
        for (char c : t.toCharArray()) {
            tCountMap.put(c, tCountMap.getOrDefault(c, 0) + 1);           // Update count
        }
     
    for (Map.Entry<Character,Integer> mapElement : sCountMap.entrySet()) {
            char key = mapElement.getKey();
            int value = mapElement.getValue();
            if(!tCountMap.containsKey(key)) return false;
            int tValue= tCountMap.get(key);
            if(value!=tValue) return false;
        }
       return true;

    }
}
