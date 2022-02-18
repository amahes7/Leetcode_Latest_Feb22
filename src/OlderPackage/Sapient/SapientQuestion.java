package OlderPackage.Sapient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SapientQuestion {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(1);
        sb.append(" ");
        sb.append(2);
        System.out.println(sb.toString().substring(1));
    }

    public static List<Integer> getNumberList(String input){
        String[] list = input.split(" ");
        List<Integer> numList= new ArrayList<>();
        for(int i=0 ; i<list.length; i++){
            numList.add(Integer.parseInt(list[i]));
        }
        Collections.sort(numList);
        return numList;
    }


}
