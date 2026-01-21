import java.util.Arrays;

public class reverse3 {
    public static void main(String[] args) {
        reverse3 obj = new reverse3();
        int[] nums = { 3, 2, 1 };
        System.out.println(Arrays.toString(obj.reverse3_1(nums)));
    }

    public int[] reverse3_1(int[] nums) {
        // return new int [] {nums[2],nums[1],nums[0]};
        int[] new_arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            new_arr[i] = nums[nums.length - 1 - i];
        }
        return new_arr;
    }

}