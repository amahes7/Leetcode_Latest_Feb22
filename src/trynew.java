public class trynew {
    public static int maximum(int num, int k) {
//        String string = String.valueOf(num);
//        char first_character = string.charAt(0);
//        String a = String.valueOf(first_character);
//        int first = Integer.parseInt(a);
//
//
//        char second_character = string.charAt(1);
//        String b = String.valueOf(second_character);
//        int second = Integer.parseInt(b);
//
//
//        char third_character = string.charAt(2);
//        String c = String.valueOf(third_character);
//        int third = Integer.parseInt(c);
//
//        int first_temp = first;
//        for (int i = 1; i <= k; i++) {
//            first_temp++;
//            k--;
//        }
//        String first_max = String.valueOf(first_temp) + String.valueOf(second) + String.valueOf(third);
//
//        int second_temp = second;
//        for (int i = 1; i <= k; i++) {
//            second_temp++;
//        }
//        String second_max = String.valueOf(first) + String.valueOf(second_temp) + String.valueOf(third);
//
//        int third_temp = third;
//        for (int i = 1; i <= k; i++) {
//            third_temp++;
//        }
//
//        String third_max = String.valueOf(first) + String.valueOf(second) + String.valueOf(third_temp);
//
//        int first_possible = Integer.parseInt(first_max);
//        int second_possible = Integer.parseInt(second_max);
//        int third_possible = Integer.parseInt(third_max);
//        int[] arr = {first_possible, second_possible, third_possible};
//        int max = arr[0];
//        for (int i = 0; i < 3; i++) {
//            if (arr[i] > max) {
//                max = arr[0];
//            }
//        }

        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = num % 10;
            num = num / 10;
        }
        int index = 2;
        while (k > 0 && index >= 0) {
            if (array[index] == 9) index--;
            else {
                array[index]++;
                k--;
            }
        }

        int res=0;
        for(int i=array.length-1;i>=0;i--) {
            res=res*10+array[i];
        }
//        int max = array[0] + array[1] * 10 + array[2] * 100;
//        return max;
        return res;
    }

    public static void main(String[] args) {
        System.out.printf("\nMaximum possible three digit value %d\n", maximum(100, 0));

    }
}
