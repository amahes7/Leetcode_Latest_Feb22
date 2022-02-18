package OlderPackage.Mcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'calcMissing' function below.
     *
     * The function accepts STRING_ARRAY readings as parameter.
     */

    public static void calcMissing(List<String> readings) {
        String[] first_reading = split(readings.get(0));
        if(first_reading[2].contains("Missing")){
            int k = getNextNeighbourForward(readings, 1);
            int ka = getNextNeighbourForward(readings, k+1);
            int a = ka-k;
            double k_data = Double.parseDouble(split(readings.get(k))[2]);
            double ka_data = Double.parseDouble(split(readings.get(ka))[2]);
            double result = k_data - (((ka_data-k_data)/a)*k);
            System.out.println(result);
        }
        for(int i=1; i<readings.size()-1; i++){
            if(readings.get(i).contains("Missing")){
                int ij = getNextNeighbourBackward(readings, i-1);
                int ik = getNextNeighbourForward(readings, i+1);
                int j = Math.abs(ij-i);
                int k = Math.abs(ik-1);
                double ij_data = Double.parseDouble(split(readings.get(ij))[2]);
                double ik_data = Double.parseDouble(split(readings.get(ik))[2]);
                double result = ij_data + ((ik_data-ij_data)/(k+j))*j;
                System.out.println(result);
            }
        }
        String[] last_reading = split(readings.get(readings.size()-1));
        if(last_reading[2].contains("Missing")){
            int nk = getNextNeighbourBackward(readings, readings.size()-2);
            int nkj = getNextNeighbourBackward(readings, nk-1);
            int k = readings.size()-nk;
            int j = readings.size()-nkj;
            double nk_data = Double.parseDouble(split(readings.get(nk))[2]);
            double nkj_data = Double.parseDouble(split(readings.get(nkj))[2]);
            double result = nk_data + ((nk_data - nkj_data)/j)*k;
            System.out.println(result);

        }
    }

    public static String[] split(String input){
        String[] output = input.split("\\s+");
        return output;
    }

    public static int getNextNeighbourForward(List<String> input, int start){
        for(int i=start; i<input.size(); i++){
            if(!input.get(i).contains("Missing")){
                return i;
            }
        }
        return 0;
    }

    public static int getNextNeighbourBackward(List<String> input, int start){
        for(int i=start; i>=0; i--){
            if(!input.get(i).contains("Missing")){
                return i;
            }
        }
        return 0;
    }
}
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int readingsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> readings = IntStream.range(0, readingsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        Result.calcMissing(readings);

        bufferedReader.close();
    }
}
