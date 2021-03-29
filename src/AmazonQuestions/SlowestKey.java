package AmazonQuestions;

public class SlowestKey {
    public static void main(String[] args) {
        int num=4;
        int[][] keyTimes = {{0, 2}, {1, 5}, {0, 9}, {2, 15}};
        longestPressKeyTime(num,keyTimes);
//        char character = 'a';
//        int ascii = (int) character;
//        System.out.println(ascii);
    }

    private static void longestPressKeyTime(int num, int[][] keyTimes) {
        int key=keyTimes[0][0];
        int slowestTime=keyTimes[0][1];
        for(int i=1;i<keyTimes.length;i++){
            int diff =keyTimes[i][1] - keyTimes[i-1][1];
            if(diff>slowestTime){
                slowestTime=diff;
                key=keyTimes[i][0];
            }
        }
        key+=97;
        String result = Character.toString((char)key);
        System.out.println(result);
    }
}
