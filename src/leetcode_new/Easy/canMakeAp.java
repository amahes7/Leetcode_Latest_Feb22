package leetcode_new.Easy;

import java.util.Arrays;

public class canMakeAp {


    public static void main(String[] args) {
        int[] input = {1,2,4};
        System.out.println(canMakeArithmeticProgression(input));
    }


    public static boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length ==2) return true;
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1] != diff) return false;
        }
        return true;
    }
}
