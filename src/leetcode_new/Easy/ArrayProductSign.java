package leetcode_new.Easy;

public class ArrayProductSign {

    public int arraySign(int[] nums) {
        int negCount =0;
        for (int n:nums){
            if (n == 0) return 0;
            else if (n<0)negCount++;
            else continue;
        }
        if (negCount%2 ==0) return 1;
        else return -1;
    }
}
