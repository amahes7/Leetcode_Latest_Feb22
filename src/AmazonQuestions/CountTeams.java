package AmazonQuestions;

import java.util.ArrayList;
import java.util.List;

public class CountTeams {
    static int ans = 0;

    public static void countTeams(int num, int[] skills, int minAssociates, int minLevel, int maxLevel) {
        List<Integer> result = new ArrayList<>();
        for (int skill : skills) {
            if (skill >= minLevel && skill <= maxLevel) {
                result.add(skill);
            }
        }
        getCombinations(result, minAssociates);
    }

    private static void getCombinations(List<Integer> result, int minAssociates) {
        if (result.size() >= minAssociates) {
            for (int i = minAssociates; i <= result.size(); i++) {
                int[] data = new int[i];
                int start = 0, index = 0, end = result.size() - 1, max = minAssociates;
                combinationUtil(result, data, start, end, index, i);
            }
        }

    }

    private static void combinationUtil(List<Integer> result, int[] data, int start, int end, int index, int max) {
        if (index == max) {
            ans++;
            for(int j=0;j<max;j++) System.out.print(data[j]+" ");
            System.out.println(" ");
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= max - index; i++) {
            data[index] = result.get(i);
            combinationUtil(result, data, i + 1, end, index + 1, max);
        }
    }


    public static void main(String[] args) {
        countTeams(6, new int[]{12, 4, 6, 13, 5, 10}, 3, 4, 10);
        System.out.println(ans);
    }
}
