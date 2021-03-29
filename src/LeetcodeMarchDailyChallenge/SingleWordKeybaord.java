package LeetcodeMarchDailyChallenge;

public class SingleWordKeybaord {

    public int calculateTime(String keyboard, String word) {
        int result = 0;
        int prev = 0;
        for (char ch : word.toCharArray()) {
            int cur = 0;
            for (int i = 0; i < 26; i++) {
                if(ch == keyboard.charAt(i)){
                    cur=i;
                    break;
                }
            }
            result+=Math.abs(cur-prev);
            prev=cur;
        }
        return result;
    }


    public static void main(String[] args) {
        SingleWordKeybaord SingleWordKeybaord = new SingleWordKeybaord();
        String keyboard = "pqrstuvwxyzabcdefghijklmno";
        String word = "leetcode";
        System.out.println(SingleWordKeybaord.calculateTime(keyboard, word));
    }
}
