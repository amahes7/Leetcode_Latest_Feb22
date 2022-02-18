package OlderPackage.AmazonQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class NearestCity {
    public static String[] findNearestCities(int numOfCities,
                                             String[] cities,
                                             int[] xCoordinates,
                                             int[] yCoordinates,
                                             int numOfQueries,
                                             String[] queries) {
        String[] result = new String[numOfQueries];
        int i = 0;
        Map<String, Set<String>> graph= findNearestCity(numOfCities,cities,xCoordinates,yCoordinates);
        for (String query : queries) {
            if(!graph.get(query).isEmpty()){
                result[i]=(String) graph.get(query).stream().toArray()[0];
                i++;
            }else{
                result[i]="NONE";
                i++;
            }
        }
        return result;
    }

    private static Map<String, Set<String>> findNearestCity(int numOfCities, String[] cities, int[] xCoordinates, int[] yCoordinates) {
        Map<String, Set<String>> resultMap= new HashMap<>();
        for(int i=0;i<numOfCities;i++){
            resultMap.put(cities[i],new TreeSet<>());
        }
        for(int i=0;i<numOfCities;i++){
            for(int j=i+1;j<numOfCities;j++){
                if(xCoordinates[i] == xCoordinates[j] || yCoordinates[i] == yCoordinates[j]){
                    resultMap.get(cities[i]).add(cities[j]);
                    resultMap.get(cities[j]).add(cities[i]);
                }
            }

        }

        return resultMap;
    }

    public static void main(String[] args) {
        int numOfCities = 8;
        String[] cities = {"monterey","m3n","mont","los gatos","los altos","san marino","san mateo","san francisco"};
        int[] xCoordinates = {3250,7000,7000,2000,4050,1000,2000,4050};
        int[] yCoordinates = {2500,19250,3000,10000,2500,2500,10000,3000};
        int numOfQueries = 7;
        String[] queries = {"monterey","m3n","mont","los gatos","los altos","san marino","san mateo","san francisco"};
        String res[] = findNearestCities(numOfCities, cities, xCoordinates, yCoordinates, numOfQueries, queries);
        for (String s : res)
            System.out.print(s + " ");
    }
}
