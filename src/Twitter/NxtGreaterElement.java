package Twitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class NxtGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int[] result = new int[len];
        ArrayList num1List = (ArrayList) Arrays.stream(nums1).boxed().collect(Collectors.toList());
        ArrayList num2List = (ArrayList) Arrays.stream(nums2).boxed().collect(Collectors.toList());
        for (int i = 0; i < len; i++) {
            int num = (int) num1List.get(i);
            int index = num2List.indexOf(num);
            boolean found=false;
            for (int j = index; j < num2List.size(); j++) {
                if ((int) num2List.get(j) > num) {
                        result[i]=(int) num2List.get(j);
                        found=true;
                        break;
                }
            }
            if(!found){
                result[i]=-1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1, 2, 3, 4};
        nextGreaterElement(nums1, nums2);
    }
}
