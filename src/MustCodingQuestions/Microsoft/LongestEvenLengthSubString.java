package MustCodingQuestions.Microsoft;

public class LongestEvenLengthSubString {

//    public static void main(String[] args) {
//        System.out.println(longestEvenLengthSubString("1234123"));
//    }
//
//    static int longestEvenLengthSubString(String str) {
//        int n = str.length();
//        int result = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j += 2) {
//                int length = j - i + 1;
//                int lSum = 0, rSum = 0;
//                for (int k = 0; k < length / 2; k++) {
//                    lSum += str.charAt(i + k) - '0';
//                    rSum += str.charAt(i + k + length / 2) - '0';
//                }
//                if (lSum == rSum && result < length) result = length;
//            }
//        }
//        return result;
//    }


    public static void main(String[] args) {

    }

    static int findLength(String str) {
        int ans = 0;
        int n = str.length();
        for (int i = 0; i <= n - 2; i++) {
            int l = i, r = i + 1;
            int lsum = 0, rsum = 0;
            while (r < n && l >= 0) {
                lsum += str.charAt(l) - '0';
                rsum += str.charAt(r) - '0';
                if (lsum == rsum) ans = Math.max(ans, r - l + 1);
                l--;
                r++;
            }
        }
        return ans;
    }
}
