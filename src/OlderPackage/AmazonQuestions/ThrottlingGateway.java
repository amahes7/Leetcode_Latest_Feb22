package OlderPackage.AmazonQuestions;

import java.util.HashMap;
import java.util.Map;

public class ThrottlingGateway {
    public static final int MAX_PER_SECOND = 3;
    public static final int MAX_TEN_SECONDS = 20;
    public static final int MAX_PER_MINUTE = 60;

    public static void main(String[] args) {
        int[] requestTime1 = new int[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 11, 11, 11, 6, 6, 6, 5, 5, 5};
        int[] requestTime2 = new int[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 11, 11, 11, 11};
        int[] requestTime3 = new int[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9,
                10, 10, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 14, 16, 16, 16, 16, 16,
                16, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20};
        ThrottlingGateway test = new ThrottlingGateway();
        System.out.println(test.droppedRequests(requestTime2));
    }

    public int droppedRequests(int[] requestTime) {
        Map<Integer, Integer> map = new HashMap<>();
        int lastReq = 0, droppedReq = 0;
        int MAX_ONE_SECOND = 3;
        int MAX_TEN_SECOND = 20;
        int MAX_ONE_MINUTE = 60;
        for (int t : requestTime) {
            map.put(t, map.getOrDefault(t, 0) + 1);
            lastReq = Math.max(lastReq, t);
        }
        int[] cum = new int[lastReq + 1];
        for (int i = 1; i < cum.length; i++) {
            int reqThisSecond = map.getOrDefault(i, 0);
            cum[i] = reqThisSecond + cum[i - 1];
            int toDrop = 0;
            //One Second validation
            if (reqThisSecond > MAX_ONE_SECOND) {
                toDrop = Math.max(toDrop, reqThisSecond - MAX_ONE_SECOND);
            }

            //10 seconds validation
            int timeTenSecondsAgo = Math.max(i - 10, 0);
            int reqTenSecondsAgo = cum[i] - cum[timeTenSecondsAgo];
            if (reqTenSecondsAgo > MAX_TEN_SECOND) {
                int numReqExceeded = Math.min(reqThisSecond, reqTenSecondsAgo - MAX_TEN_SECOND);
                toDrop = Math.max(toDrop, numReqExceeded);
            }

            //One minute
            int timeOneMinuteAgo = Math.max(i - 60, 0);
            int reqPastOneMinute = cum[i] - cum[timeOneMinuteAgo];
            if (reqPastOneMinute > MAX_ONE_MINUTE) {
                int exceeded = Math.min(reqThisSecond, reqPastOneMinute - MAX_ONE_MINUTE);
                toDrop = Math.max(toDrop, exceeded);
            }
            droppedReq += toDrop;

        }
        return droppedReq;
    }
}





