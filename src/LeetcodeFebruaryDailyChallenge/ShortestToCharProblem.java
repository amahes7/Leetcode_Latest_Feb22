package LeetcodeFebruaryDailyChallenge;

import LeetcodeMarchDailyChallenge.SingleWordKeybaord;

import java.util.ArrayList;
import java.util.List;

public class ShortestToCharProblem {

    public static void main(String[] args) {
        ShortestToCharProblem ShortestToCharProblem = new ShortestToCharProblem();
        String keyboard = "loveleetcode";
        char word = 'e';
        System.out.println(ShortestToCharProblem.shortestToChar(keyboard, word));
    }

    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        List<Integer> pos = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(c == s.charAt(i)){
                pos.add(i);
            }
        }

        for(int i=0;i<s.length();i++){
            int min= Integer.MAX_VALUE;
            for(int n:pos){
                if(min>Math.abs(i-n)){
                    min=Math.abs(i-n);
                }
            }
            result[i]=min;
        }
        return result;
    }
}
