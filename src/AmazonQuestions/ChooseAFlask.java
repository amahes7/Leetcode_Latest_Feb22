package AmazonQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class ChooseAFlask {
    static int chooseAFlask(int numOrders,
                            List<Integer> requirements,
                            int flaskTypes,
                            int totalMarks,
                            int[][] markings) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < flaskTypes; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int i = 0; i < totalMarks; i++) {
            map.get(markings[i][0]).add(markings[i][1]);
        }
        int minWaste=Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < flaskTypes; i++) {
            int waste = getWaste(map.get(i), requirements, numOrders);
            if(waste<=minWaste){
                minWaste=waste;
                result.add(i);
            }
        }
        if(result.size() >1){
            Collections.sort(result);
            return (result.get(0));
        }else if(result.size()==1){
            return (result.get(0));
        }else {
            return -1;
        }
    }

    private static int getWaste(List<Integer> markings, List<Integer> requirements, int numOrders) {
        int waste = 0;
        if (Collections.max(requirements) > Collections.max(markings)) {
            return Integer.MAX_VALUE;
        }
        Collections.sort(markings);
        for (int requirement : requirements) {
            for (int marking : markings) {
                if (marking >= requirement) {
                    waste += (marking - requirement);
                }
            }
        }
        return waste;
    }

    public static void main(String[] args) {
        int numOrders = 4;
        List<Integer> requirements = Arrays.asList(4, 6, 8, 6, 7);
        int flaskTypes = 3;
        int totalMarks = 9;
        int[][] markings = {{0, 3}, {0, 5}, {0, 7}, {1, 6}, {1, 8}, {1, 9}, {2, 3}, {2, 5}, {2, 6}};
        System.out.println(chooseAFlask(numOrders, requirements, flaskTypes, totalMarks, markings));
    }

}
