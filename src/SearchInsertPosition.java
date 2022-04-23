public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int output = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                output = i;
                break;
            }
        }

        if (output == -1) {
            for (int i = 0; i < nums.length; i++) {
                if (i == nums.length - 1) {
                    if (target > nums[i]) {
                        output = i + 1;
                        break;
                    }
                }

                if (target < nums[i]) {
                    output = i;
                    break;
                } else if (nums[i] < target && target < nums[i + 1]) {
                    output = i + 1;
                    break;
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;

        System.out.println(searchInsert(nums1, target1));
        System.out.println(searchInsert(nums1, target2));
        System.out.println(searchInsert(nums1, target3));
    }
}
