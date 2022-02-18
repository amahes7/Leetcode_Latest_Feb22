package OlderPackage.Mcd;

public class BuzzFizz {
    public static void main(String[] args) {
        fizzBuzz(15);

    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            int mod3 = i % 3;
            int mod5 = i % 5;
            if (mod3 == 0 && mod5 == 0) System.out.println("FizzBuzz");
            else if(mod3 == 0) System.out.println("Fizz");
            else if(mod5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
