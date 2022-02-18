package leetcode_new.Medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                maxArea = Math.max(maxArea, Math.min(height[i], height[j] * (j - i)));
            }
        }
        return maxArea;
    }


    public int maxAreaOp(int[] height) {

        int maxArea = 0,start=0,end = height.length-1;
        while (start < end){
            maxArea = Math.max(maxArea, Math.min(height[start], height[end] * (end - start)));
            if (height[start]< height[end]) start++;
            else end--;
        }
        return maxArea;
    }


}
