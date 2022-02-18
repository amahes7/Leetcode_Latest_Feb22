package OlderPackage.CodeByte.AlgorithmCourse;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] input = {0,1,0,3,2};
        moveZeroes(input);
    }

    public static void moveZeroes(int[] nums) {
    int index=0,it=0;
    while(it<nums.length){
        if(nums[it] !=0){
            nums[index] = nums[it];
            index++;
        }
        it++;
    }
    while (index < nums.length){
        nums[index] = nums[it];
        index++;
    }
    }
}
