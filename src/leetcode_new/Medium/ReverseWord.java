package leetcode_new.Medium;

public class ReverseWord {

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello  world  "));
    }

    public static String reverseWords(String s) {
        StringBuilder res= new StringBuilder();
        String[] wordList= s.trim().split(" ");
        for (int i=wordList.length-1;i>=0;i--){
            if (!wordList[i].isEmpty()){
                res.append(wordList[i]).append(" ");
            }
        }
        return res.toString().trim();
    }
}
