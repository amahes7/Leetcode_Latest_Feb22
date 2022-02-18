package OlderPackage.Random;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapKeys {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(123423423, 1);
        map.put(1123, 1);
        map.put(1423, 1);
        map.put(1524323, 1);
        map.put(123424, 1);

        Set<Integer> treeSet = new TreeSet<>(map.keySet());
        treeSet.stream().forEach(System.out::println);

    }
}
