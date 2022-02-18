package leetcode_new.Medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterRestaurant {

    public static void main(String[] args) {
        int[][] input1 = {{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}};
        System.out.println(filterRestaurants(input1, 0, 50, 10));
    }

    public static List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {

        return Arrays
                .stream(restaurants)
                .filter(r -> r[2] == veganFriendly && r[3] <= maxPrice && r[4] <= maxDistance)
                .sorted((r1, r2) -> {
                    int x = Integer.compare(r2[1], r1[1]);
                    if (x != 0) return x;
                    else return Integer.compare(r2[0], r1[0]);
                })
                .map(r -> r[0])
                .collect(Collectors.toList());


    }
}
