import java.util.Arrays;
public class maxEnd3 {
    public static void main(String[] args) {

        maxEnd3 obk = new maxEnd3();
        int[] nums = { 1, 2, 3 };
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {11, 5, 9};
        int[] nums3 = {2, 11, 3};

        System.out.println(Arrays.toString(obk.maxEnd31(nums1))); // [3, 3, 3]
        System.out.println(Arrays.toString(obk.maxEnd31(nums2))); // [11, 11, 11]
        System.out.println(Arrays.toString(obk.maxEnd31(nums3))); // [3, 3, 3]
    }

   public int[] maxEnd31(int[] nums) {
 int max = 0;
      max = Math.max(nums[0], max);
       max = Math.max(nums[2], max);
        return new int[] { max, max, max };
}

}
