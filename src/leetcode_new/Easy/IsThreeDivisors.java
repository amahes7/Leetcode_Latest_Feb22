package leetcode_new.Easy;

public class IsThreeDivisors {
    public static boolean isThree(int n) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) count++;
            if (count > 1) return false;
        }
        return (count == 1) ? true : false;

    }


    public static void main(String[] args) {
//        System.out.println(isThree(4));
        System.out.println('1');
    }


}
