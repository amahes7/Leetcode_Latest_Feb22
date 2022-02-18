package TopInterviewQuestions.Easy.Array;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 ) return 0;
        int current = Integer.MIN_VALUE;
        int count =0;
        for(int num:nums){
            if(num !=current){
                nums[count] = num;
                current = num;
                count++;
            }
        }
        return count;
    }
}
