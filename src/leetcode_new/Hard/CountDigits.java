package leetcode_new.Hard;

import org.w3c.dom.html.HTMLBRElement;

public class CountDigits {

    public static int digitsCount(int d, int low, int high) {
        StringBuilder sb = new StringBuilder();
        for (int i = low; i <= high; i++) {
            sb.append(i);
        }
        int ans = 0;
        for (char ch : sb.toString().toCharArray()) {
            if (Character.getNumericValue(ch) == d) ans++;
        }
        return ans;
    }


    public static int digitsCountOp(int d, int low, int high) {
        return getOccurence(high, d) - getOccurence(low - 1, d);
    }

//    public static int helper(int d, int n) {
//        int result = 0;
//        int i = d;
//        while (i <= n) {
//            if (i % 10 == d) result++;
//            if (i != 0 && i / 10 == d) {
//                result++;
//                i++;
//            } else if (i / 10 == d - 1) {
//                i = i + 10 - d;
//            } else {
//                if (i % 10 != d) result++;
//                i += 10;
//            }
//        }
//        return result;
//    }


    static int getOccurence(int n, int d) {

        // Initialize result
        int result = 0;

        // Count appearances in numbers
        // starting from d.
        int itr = d;

        while (itr <= n) {

            // When the last digit is
            // equal to d
            if (itr % 10 == d)
                result++;

            // When the first digit is
            // equal to d then
            if (itr != 0 && itr / 10 == d) {

                // increment result as
                // well as number
                result++;
                itr++;
            }

            // In case of reverse of number
            // such as 12 and 21
            else if (itr / 10 == d - 1)
                itr = itr + (10 - d);
            else if (itr % 10 == 0) {
                itr = itr + d;
            } else itr = itr + 10;
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(digitsCountOp(3, 100, 250));
    }
}
