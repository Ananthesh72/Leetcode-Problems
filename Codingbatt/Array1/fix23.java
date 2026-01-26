import java.util.Arrays;

public class fix23 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        fix23 obj = new fix23();
        System.out.println(Arrays.toString(obj.fix23_(nums)));
    }

    public int[] fix23_(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

}
