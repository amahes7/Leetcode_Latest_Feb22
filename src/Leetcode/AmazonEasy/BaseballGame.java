package Leetcode.AmazonEasy;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        List<Integer> record = new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "+":
                    record.add(record.get(record.size()-1)+record.get(record.size()-2));
                    break;
                case "D":
                    int result2 = record.stream().skip(record.size() - 1).findFirst().orElse(0);
                    record.add(result2*2);
                    break;
                case "C":
                    record.remove(record.size()-1);
                    break;
                default:
                    record.add((Integer.valueOf(ops[i])));
            }
        }
        int result = record.stream().reduce(0,(a,b)->a+b);
        return result;

    }

    public static void main(String[] args){
        String[] input = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(input));
    }
}
