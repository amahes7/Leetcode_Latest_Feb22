package Trial1;

import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {
        String reg = "^[a-zA-Z0-9]*";

        boolean a =Pattern.matches("[a-zA-Z0-9_]{5,10}","Abhije_1");
        System.out.println(a);
    }
}
