class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num: nums)
        {
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Integer key: countMap.keySet())
        {
            minHeap.offer(new int[]{countMap.get(key), key});
            if(minHeap.size()>k)
            {
                minHeap.poll();
            }
        }
        int[] res=new int[k];
        //System.out.println("minHeap"+minHeap.peek());
        for(int i=0;i<k;i++)
        {
            res[i]=minHeap.poll()[1];
        }
        
        return res;
        
    }
}
