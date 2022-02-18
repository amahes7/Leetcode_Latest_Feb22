package OlderPackage.bloomberg;

import java.util.Arrays;

public class KnightDialer {

    public static int knightDialer(int N) {
        double[] res = new double[10];
        Arrays.fill(res, 1);
        for (int i = 1; i < N; i++){
            double[] next = new double[10];
            next[0] = (res[4] + res[6]) % 1000000007;
            next[1] = (res[6] + res[8]) % 1000000007;
            next[2] = (res[7] + res[9]) % 1000000007;
            next[3] = (res[4] + res[8]) % 1000000007;
            next[4] = (res[3] + res[0] + res[9]) % 1000000007;
            next[6] = (res[1] + res[7] + res[0]) % 1000000007;
            next[7] = (res[2] + res[6]) % 1000000007;
            next[8] = (res[1] + res[3]) % 1000000007;
            next[9] = (res[2] + res[4]) % 1000000007;
            res = next;
        }
        double sum = 0;
        for (double i: res){
            sum += i % 1000000007;
            sum %= 1000000007;
        }
        return (int)sum;
    }


    public static void main(String[] args){
        System.out.println(knightDialer(3));
    }
}
