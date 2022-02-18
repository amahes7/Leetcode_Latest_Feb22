package OlderPackage.AmazonQuestions;

public class ItemsInContainers {
    private static int[] checkItemsInContainer(int[] startIndices, int[] endIndices, String s) {
        int num = startIndices.length;
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            char[] temp = s.substring(startIndices[i] - 1, endIndices[i]).toCharArray();
            int pos = 0;
            int count = 0;
            int j = 0;
            for (Character c : temp) {
                if (pos == (-1) && c.equals('*')) {
                    count++;
                }

                if (pos == (-1) && c.equals('|')) {
                    result[j] = count;
                    j++;
                    pos = 0;
                }
                if (c.equals('|')) {
                    pos = -1;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] startIndices = {1};
        int[] endIndices = {3};
        String s = "*|*|";
        int[] result = checkItemsInContainer(startIndices, endIndices, s);
        for (int r : result) {
            System.out.println(r);
        }
    }
}
