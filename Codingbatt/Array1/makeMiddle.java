import java.util.Arrays;
public class makeMiddle {
    public static void main(String[] args) {
        makeMiddle obj = new makeMiddle();
        System.out.println(Arrays.toString(obj.makeMiddle_(new int[] { 7, 1, 2, 3, 4, 9 })));

    }

    public int[] makeMiddle_(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        int middle = nums.length / 2;
        return new int[] { nums[middle - 1], nums[middle] };
    }

}
