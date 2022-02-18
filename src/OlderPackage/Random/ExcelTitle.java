package OlderPackage.Random;

public class ExcelTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int n) {
        String ret = "";
        while (n != 0) {
            ret = (char) ('A' + (--n) % 26) + ret;
            n /= 26;
        }
        return ret;
    }
}
