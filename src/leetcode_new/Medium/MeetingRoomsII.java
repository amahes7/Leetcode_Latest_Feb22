package leetcode_new.Medium;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomsII {

    public int minMeetingRooms(int[][] intervals) {
        Integer[] start = new Integer[intervals.length];
        Integer[] end = new Integer[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(
                start,
                new Comparator<Integer>() {
                    public int compare(Integer a, Integer b) {
                        return a - b;
                    }
                });
        Arrays.sort(end, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        int starttime = 0, endtime = 0, result = 0;
        while (start[starttime] < intervals.length) {
            if (start[starttime] >= end[endtime]) {
                result--;
                endtime++;
            }
            result++;
            starttime++;
        }
        return result;
    }
}