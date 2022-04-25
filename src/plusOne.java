import java.util.Arrays;

public class plusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--){
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4,3,2,1};
        int[] nums3 = {9,9};
        int[] nums4 = {9,8,7,6,5,4,3,2,1,0};

        System.out.println(Arrays.toString(plusOne(nums1)));
        System.out.println(Arrays.toString(plusOne(nums2)));
        System.out.println(Arrays.toString(plusOne(nums3)));
        System.out.println(Arrays.toString(plusOne(nums4)));
    }
}
