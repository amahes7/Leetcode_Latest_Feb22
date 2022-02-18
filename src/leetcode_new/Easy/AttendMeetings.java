package leetcode_new.Easy;

public class AttendMeetings {


    public boolean canAttendMeetings(int[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (checkOverlap(intervals[i], intervals[j])) return false;
            }
        }
        return true;
    }

    private boolean checkOverlap(int[] i1, int[] i2) {
        return (i1[0] >= i2[0] && i1[0] < i2[1])
                || (i2[0] >= i1[0] && i2[0] < i1[1]);
    }
}
