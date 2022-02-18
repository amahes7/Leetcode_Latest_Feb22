package TopInterviewQuestions.Easy.Array;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateClockwise(input);
        rotateAntiClockwise(input);
    }

    private static void rotateAntiClockwise(int[][] arr) {
        int N = arr.length;
        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - 1 - i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][N - 1 - i];
                arr[j][N - 1 - i] = arr[N - 1 - i][N - j - 1];
                arr[N - 1 - i][N - j - 1] = arr[N - j - 1][i];
                arr[N - j - 1][i] = temp;
            }
        }
    }

    public static void rotateClockwise(int[][] arr) {
        int N = arr[0].length;
        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < N - 1 - i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[N - 1 - j][i];
                arr[N - 1 - j][i] = arr[N - 1 - i][N - 1 - j];
                arr[N - 1 - i][N - 1 - j] = arr[j][N - 1 - i];
                arr[j][N - 1 - i] = temp;
            }
        }
    }
}
