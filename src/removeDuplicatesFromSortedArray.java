public class removeDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int output = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[output]) {
                output++;
                nums[output] = nums[i];
            }
        }

        return output + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums1));
        System.out.println(removeDuplicates(nums2));
    }
}
