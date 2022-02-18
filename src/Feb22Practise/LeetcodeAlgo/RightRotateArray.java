package Feb22Practise.LeetcodeAlgo;

public class RightRotateArray {

    public void rotate(int[] nums, int k) {
        int[] temp = new int[k];
        int n = nums.length;
        if (k<=0|| k==n) return;
        if (k>n) k=k%n;
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }
        for (int i = n - k + 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
