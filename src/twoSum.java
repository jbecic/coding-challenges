import java.util.Arrays;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] outPut = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int otherNum = nums[j];
                if (num + otherNum == target) {
                    outPut[0] = i;
                    outPut[1] = j;
                }
            }
        }

        return outPut;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,7,11,15};
        int[] arr2 = {3, 2, 4};
        int[] arr3 = {3, 3};

        System.out.println(Arrays.toString(twoSum(arr1, 9)));
        System.out.println(Arrays.toString(twoSum(arr2, 6)));
        System.out.println(Arrays.toString(twoSum(arr3, 6)));
    }
}
