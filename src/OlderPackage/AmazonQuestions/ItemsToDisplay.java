package OlderPackage.AmazonQuestions;//package AmazonQuestions;
//
//// "static void main" must be defined in a public class.
//public class Main {
//    static List<String> fetchItemsToDisplay(int numOfItems, HashMap<String, Pair> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber){
//        if(items.size() == 0)
//            return Collections.EMPTY_LIST;
//
//        SortedSet<Map.Entry<String, Pair>> set = new TreeSet<>(new Comparator<Map.Entry<String, Pair>>() {
//            @Override
//            public int compare(Map.Entry<String, Pair> entry1, Map.Entry<String, Pair> entry2) {
//                if(sortParameter == 0){
//                    if(sortOrder == 0){
//                        return entry1.getKey().compareTo(entry2.getKey());
//                    }
//                    return entry2.getKey().compareTo(entry1.getKey());
//                }
//                if(sortParameter == 1){
//                    if(sortOrder == 0){
//                        return (int)entry1.getValue().getKey() - (int)entry2.getValue().getKey();
//                    }
//                    return (int)entry2.getValue().getKey() - (int)entry1.getValue().getKey();
//                }
//                if(sortParameter == 2){
//                    if(sortOrder == 0){
//                        return (int)entry1.getValue().getValue() - (int)entry2.getValue().getValue();
//                    }
//                    return (int)entry2.getValue().getValue() - (int)entry1.getValue().getValue();
//                }
//                return 0;
//            }
//        });
//
//        set.addAll(items.entrySet());
//
//        List<String> result = new ArrayList<>();
//        for(Map.Entry<String,Pair> entry : set){
//            result.add(entry.getKey());
//        }
//
//        int start = pageNumber * itemsPerPage;
//        int end = (start + itemsPerPage) > result.size() ? result.size() : start + itemsPerPage;
//
//        return result.subList(start, end);
//    }
//
//    public static void main(String[] args) {
//        HashMap<String, Pair> items = new HashMap<>();
//        items.put("item1",new Pair(10,15));
//        items.put("item2",new Pair(3,4));
//        items.put("item3",new Pair(17,8));
//
//        fetchItemsToDisplay(3,items,2,0,2,1).forEach(l-> System.out.println(l));
//    }
//}