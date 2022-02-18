package leetcode_new.Easy;

public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[nums.length-1]<target) return nums.length;
            else if(nums[i]>=target) return i;
        }
        return 0;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,8};
        System.out.println(searchInsert(arr,7));
    }
}
