package TopInterviewQuestions.Easy.Array;

public class RotateArray {

    public static void main(String[] args) {
        int[] p = new int[]{1, 2, 3, 4, 5, 6, 7};
//        rightRotateArray(p, 3);
        leftRotateArray(p,3);
    }

    public static void rightRotateArray(int[] arr, int k) {
        for (int i = 0; i < k; i++)
            rightRotateArrayByOne(arr);
    }

    private static void rightRotateArrayByOne(int[] arr) {
        int temp = arr[arr.length - 1], i;
        for (i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = temp;
    }

    public static void leftRotateArray(int[] arr, int k) {
        for (int i = 0; i < k; i++)
            leftRotateArrayByOne(arr);
    }

    private static void leftRotateArrayByOne(int[] arr) {
        int temp = arr[0], i;
        for (i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }


}

