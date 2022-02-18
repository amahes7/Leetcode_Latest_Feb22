package leetcode_new.Medium;

import java.util.Arrays;

public class maxCakeArea {

    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int m = horizontalCuts.length;
        int n = verticalCuts.length;
        int maxheight = Math.max(horizontalCuts[0], h - horizontalCuts[m - 1]);
        int maxwidth = Math.max(verticalCuts[0], w - verticalCuts[n - 1]);
        for (int i = 1; i < m; i++) maxheight = Math.max(maxheight, horizontalCuts[i] - horizontalCuts[i - 1]);
        for (int i = 1; i < n; i++) maxwidth = Math.max(maxwidth, verticalCuts[i] - verticalCuts[i - 1]);
        return ((maxheight * maxwidth) % (1000000007));
    }

    public static void main(String[] args) {
        System.out.println(maxArea(5, 4, new int[]{3, 1}, new int[]{1}));
    }
}
