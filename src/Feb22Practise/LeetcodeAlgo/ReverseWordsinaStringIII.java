package Feb22Practise.LeetcodeAlgo;

import com.sun.tools.javac.util.StringUtils;

public class ReverseWordsinaStringIII {

    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        for (String str : s.split(" ")) {
            StringBuilder word = new StringBuilder(str).reverse();
            result.append(word);
            result.append(" ");
        }
        return result.toString().trim();
    }
}
