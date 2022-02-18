package TopInterviewQuestions.Easy.Array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] p = new int[]{1, 0, 1, 2, 0, 0, 1};
        int[] res = moveZeroes(p);
        System.out.println("Done");
    }

    public static int[] moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
            j++;
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
        return nums;
    }
}
