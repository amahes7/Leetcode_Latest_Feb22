package OlderPackage.AmazonQuestions;

public class SplitUniquePrime1 {
    public static void main(String[] args) {
        String n = "11373";
        System.out.println("Result: "+solve(n));
    }

    private static int solve(String s) {
        int mod = (int) 1e9 + 7;
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = Math.max(0, i - 6); j < i; j++) {
                int a= Integer.parseInt(s.substring(j, i));
                if (isPrime(a)) {
                    dp[i] = (dp[i] + dp[j]) % mod;
                }
            }
        }
        return dp[s.length()];
    }

    private static boolean isPrime(int input) {
        if(input == 1 || input == 0) return false;
        boolean result = true;
        for(int i = 2; i<=input/2; i++) {
            if(input % i == 0) {
                result  = false;
            }
        }
        return result;
    }
}
