
/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * public int getStart() {
 *            return start;
 *        }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int counter=0;
        Queue<Integer> minHeap=new PriorityQueue<>();


        List<Interval> intervals2= intervals.stream().sorted((s1,s2)->Integer.compare(s1.start, s2.start)).collect(Collectors.toList());
        for(Interval interval: intervals2)
        {
            int start=interval.start;
            int end=interval.end;
        if(minHeap.size()>0 && minHeap.peek()<=start)
        {
            minHeap.poll();
        }
        minHeap.offer(end);

        }
        return minHeap.size();

    }
}
