package leetcode_new.Easy;

public class Leetcode1576 {

    public static void main(String[] args) {
        System.out.println(modifyString("j?qg??b"));
    }

    public static String modifyString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '?') {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if (i > 0 && ch == arr[(i - 1)]) continue;
                    else if (i < s.length() - 1 && ch == arr[i + 1]) continue;
                    else {
                        arr[i] = ch;
                        break;
                    }
                }
            } else arr[i] = c;
        }
        return new String(arr);
    }
}
