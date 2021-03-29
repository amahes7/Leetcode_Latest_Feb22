package Mcd;

class Question1 {

    /*
     * Complete the 'getMinDeletions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static void main(String[] args) {
        System.out.println(getMinDeletions("bbeadcebfp"));

    }

    public static int getMinDeletions(String str) {
        // Write your code here
        int n = str.length();

        // Variable to store count of
        // distinct characters
        int dist_count = 0;
        int count[] = new int[n];

        // To store counts of different
        // characters
        for(int i = 0; i < n; i++)
            count[i] = 0;

        for (int i = 0; i < n; i++)
        {
            if(count[str.charAt(i)-'a'] == 0)
                dist_count++;
            count[str.charAt(i)-'a']++;
        }

        // Answer is, n - number of distinct char
        return (n-dist_count);

    }

}


