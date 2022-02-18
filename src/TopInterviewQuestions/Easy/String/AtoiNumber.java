package TopInterviewQuestions.Easy.String;

public class AtoiNumber {

    public static void main(String[] args) {
        String s = " ";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        String str = s.trim();
        if (str.isEmpty() || str == null ) return 0;
        int i = 0, sign = 0;
        double result = 0;

        if (str.charAt(0) == '-') {
            sign = 1;
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }
        if (sign == 1) result = -result;

        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return (int) result;
    }
}
