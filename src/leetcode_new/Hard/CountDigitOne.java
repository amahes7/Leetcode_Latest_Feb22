package leetcode_new.Hard;

public class CountDigitOne {

    static int countDigitOne(int n) {
        int countr = 0;
        for (int i = 1; i <= n; i *= 10) {
            int divider = i * 10;
            countr += (n / divider) * i +
                    Math.min(Math.max(n %
                            divider - i +
                            1, 0), i);
        }
        return countr;
    }

    public static void main(String[] args) {
        int n = 13;
        n = 113;
        System.out.println(countDigitOne(n));
    }
}
