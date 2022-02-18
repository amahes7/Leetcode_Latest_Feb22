package OlderPackage.CodeByte.AlgorithmCourse;

public class ReverseAWordInAStringIII {

//    Input: s = "Let's take LeetCode contest"
//    Output: "s'teL ekat edoCteeL tsetnoc"


    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(new StringBuilder(str).reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }


}
