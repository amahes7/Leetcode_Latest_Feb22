package OlderPackage.Online;

import java.util.*;

public class ShoppingPatternAmazon {


    private static int getMinScore(int productNodes, List<Integer> productsFrom,
                                   List<Integer> productsTo) {
        if (productNodes < 1 || productsFrom == null || productsTo == null
                || productsTo.size() != productsFrom.size())
            return -1;
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= productNodes; i++) {
            graph.put(i, (new HashSet<Integer>()));
        }
        for (int i = 0; i < productsFrom.size(); i++) {
            graph.get(productsFrom.get(i)).add(productsTo.get(i));
            graph.get(productsTo.get(i)).add(productsFrom.get(i));
        }
        int count = Integer.MAX_VALUE;
        for (int i = 1; i <= productNodes; i++) {
            for (int j = i + 1; j <= productNodes; j++) {
                for (int k = j + 1; k <= productNodes; k++) {
                    if (graph.get(i).contains(j) && graph.get(j).contains(k) && graph.get(k).contains(i)) {
                        int val = (graph.get(i).size() + graph.get(j).size() + graph.get(k).size()) - 6;
                        count = Math.min(count, val);
                    }
                }
            }
        }
        return (count == Integer.MAX_VALUE) ? -1 : count;
    }

    public static void main(String[] args) {

    }
}
