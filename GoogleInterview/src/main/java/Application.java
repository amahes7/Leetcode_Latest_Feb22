import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> reports = new HashMap<>();
        Map<Integer, List<Integer>> report = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        reports.put(1, list1);
        reports.put(2, list2);
        reports.put(3, new ArrayList<>());
        reports.put(4, new ArrayList<>());
        reports.put(5, new ArrayList<>());
        report.put(11,new ArrayList<>());
//        System.out.println("CRC Count = " + getCRCCount(3, reports));
        Map<Integer, Integer> result = new HashMap<>();
        transformMap(report, result);
    }

    private static int getCRCCount(int eid, Map<Integer, List<Integer>> reports) {
        int count = 1;
        List<Integer> list = reports.get(eid);
        for (int i = 0; i < list.size(); i++) {
            if (reports.get(list.get(i)).size() == 0) {
                count = count + 1;
            } else {
                count = count + getCRCCount(list.get(i), reports);
            }
        }
        return count;
    }

    private static void transformMap(Map<Integer, List<Integer>> reports, Map<Integer, Integer> result) {
        int count = 1;
        for (int i = 0; i < reports.size(); i++) {
            List<Integer> list = reports.get(i);
            if(list == null ){
                result.put((Integer) reports.keySet().toArray()[i],1);
            }
            else if (!result.containsKey(reports.keySet().toArray()[i])) {
                result.put((Integer) reports.keySet().toArray()[i], getcount(list, reports, result));
            }

        }
    }

    private static int getcount(List<Integer> list, Map<Integer, List<Integer>> reports, Map<Integer, Integer> result) {
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            if (reports.get(list.get(i)).size() == 0) {
                result.put(list.get(i), 1);
            } else {
                count = count + getcount(reports.get(list.get(i)), reports, result);
                result.put(list.get(i), count);
            }
        }
        return count;
    }
}
