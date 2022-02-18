package Feb22Practise.DP;

public class Tribonacci {

    public int tribonacci(int n) {
        if (n == 0) return 0;
        else if (n <= 2) return 1;
        int[] result = new int[n + 1];
        result[0]=0;
        result[1]=1;
        result[2]=1;
        for (int i = 3; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }
        return result[n];
    }
    public int tribonacciOp(int n) {
       if (n<3) return n==0?0:1;
       int temp ,x=0,y=1,z=1;
        for (int i = 3; i <= n; i++) {
            temp=x+y+z;
            x=y;
            y=z;
            z=temp;
        }
        return z;
    }
    public static void main(String[] args) {
        Tribonacci Tribonacci = new Tribonacci();
        System.out.println(Tribonacci.tribonacciOp(25));
    }
}
