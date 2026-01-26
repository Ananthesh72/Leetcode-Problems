import java.util.Arrays;

public class makeLast {
    public static void main(String[] args) {
        makeLast obj = new makeLast();
        // makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
        // makeLast([1, 2]) → [0, 0, 0, 2]
        // makeLast([3]) → [0, 3]
        int[] nums = { 4, 5, 6 };
        System.out.println(Arrays.toString(obj.makeLast1(nums)));
    }

    public int[] makeLast1(int[] nums) {
        int[] arr = new int[nums.length * 2];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }

}