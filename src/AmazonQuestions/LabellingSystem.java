package AmazonQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LabellingSystem {
    public static void main(String[] args) {
        String originalLabel= "baccc";
        int charLimit=2;
        getNewLabel(originalLabel,charLimit);
    }

    private static void getNewLabel(String originalLabel, int charLimit) {
        List<Character> list= new ArrayList<>();
        for(char a :originalLabel.toCharArray()){
            list.add(a);
        }
        Collections.sort(list,Collections.reverseOrder());
        int count=1,i=1;
        char[] result= new char[list.size()];
        result[0] =list.get(0);
        list.remove(0);
        while(!list.isEmpty()){
            if(list.get(0).equals(result[i-1])){
                count++;
                if(count >2){
                    result[i] = list.get(1);
                    list.remove(1);
                    i++;
                }else{
                    result[i] =list.get(0);
                    list.remove(0);
                    i++;
                }
            }else{
                result[i] =list.get(0);
                list.remove(0);
                i++;
            }
        }
        System.out.println("New Label: "+ Arrays.toString(result));
    }
}
