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
        for (int i = 0; i < intervals.size(); i++){
            int end1 = intervals.get(i).end; 
            int start1 = intervals.get(i).start;

            for (int j = 0; j < intervals.size(); j++){
                if (j == i) continue;

                int start2 = intervals.get(j).start;
                int end2 = intervals.get(j).end;

                System.out.println(start1 + " " + end1 + "\n" + start2 + " " + end2);

                if (start1 < end2 && end1 > start2) return false;
            }
        }

        

        return true;
    }
}
