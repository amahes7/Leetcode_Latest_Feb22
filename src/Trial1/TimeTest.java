package Trial1;

import java.text.ParseException;

public class TimeTest {

    public static void main(String[] args) throws ParseException {
        int a =4;
        fun(a);
//        System.out.println(--a);
    }
    static void fun(int x){
        if(x>0){
            fun(--x);
            System.out.println(x);
            fun(--x);
        }
    }
}
