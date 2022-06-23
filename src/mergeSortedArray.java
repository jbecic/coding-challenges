import java.util.Arrays;

public class mergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = n+m-1;
        n-=1;
        m-=1;
        while(n>=0 && m>=0){
            if(nums1[m]>nums2[n]){
                nums1[index--] = nums1[m--];
            }else{
                nums1[index--] = nums2[n--];
            }
        }
        while(index>=0 && n>=0){
            nums1[index--] = nums2[n--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m1 = 3;
        int[] nums2 = {2,5,6};
        int n1 = 3;
        merge(nums1, m1, nums2, n1);

        System.out.println(Arrays.toString(nums1));

        int[] nums3 = {1};
        int m2 = 1;
        int[] nums4 = new int[1];
        int n2 = 0;
        merge(nums3, m2, nums4, n2);

        System.out.println(Arrays.toString(nums3));

        int[] nums5 = {0};
        int m3 = 0;
        int[] nums6 = {1};
        int n3 = 1;
        merge(nums5, m3, nums6, n3);

        System.out.println(Arrays.toString(nums5));

        int[] nums7 = {4,5,6,0,0,0};
        int m4 = 3;
        int[] nums8 = {1,2,3};
        int n4 = 3;
        merge(nums7, m4, nums8, n4);

        System.out.println(Arrays.toString(nums7));


    }
}
