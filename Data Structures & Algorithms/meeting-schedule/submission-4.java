/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() == 0 || intervals.size() == 1) return true;
        for (int i = 0; i < intervals.size() - 1; i++){
            int start = intervals.get(i).start; 
            for (int j = 0; j < intervals.size() - 1; j++){
                int start2 = intervals.get(j).start;
                int end2 = intervals.get(j).end;

                if (start < end2 && start > start2) return false;
            }
        }

        

        return true;
    }
}
