package OlderPackage.CodeByte.AlgorithmCourse;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdbcbb"));
    }


    public static int lengthOfLongestSubstring(String s) {
        String test = "";
        int result = 0;
        for (char ch : s.toCharArray()) {
            String current = String.valueOf(ch);
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current) + 1);
            }
            test = test + current;
            result = Math.max(test.length(), result);
        }
        return result;
    }
}
