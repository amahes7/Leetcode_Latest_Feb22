package leetcode_new.Easy;

public class Leetcode1945 {

    public static int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) sb.append(ch - 'a' + 1);
        String num = sb.toString();
        while (k > 0) {
            k--;
            num = helper(num);
        }
        return Integer.parseInt(num);
    }

    private static String helper(String num) {
        int sum = 0;
        for (char ch : num.toCharArray()) {
            sum += (ch-'1'+1);
        }
        return String.valueOf(sum);
    }

    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
    }
}
