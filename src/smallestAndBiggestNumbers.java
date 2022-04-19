import java.util.Arrays;

public class smallestAndBiggestNumbers {
    public static int[] minMax(int[] arr) {
        int[] output = new int[2];
        int small = arr[0];
        int big = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            } else if (arr[i] > big) {
                big = arr[i];
            }
        }
        output[0] = small;
        output[1] = big;

        return output;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2334454, 5};
        int[] arr3 = {1};

        System.out.println(Arrays.toString(minMax(arr1)));
        System.out.println(Arrays.toString(minMax(arr2)));
        System.out.println(Arrays.toString(minMax(arr3)));
    }
}
