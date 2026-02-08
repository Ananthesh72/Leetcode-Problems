// import java.util.Math
public class maxTriple {
    public static void main(String[] args) {
        maxTriple obj = new maxTriple();
        // int [] nums={1, 2, 3};
        int[] nums = { 1, 7, 3, 1, 5 };

        System.out.println(obj.maxTriple1(nums));
    }

    public int maxTriple1(int[] nums) {
        // 1 solution
        // int max = 0;
        // int start = nums[0];
        // int mid = nums[nums.length/2];
        // int end = nums[nums.length -1];
        // max = Math.max(max, start);
        // max = Math.max(max, mid);
        // max = Math.max(max, end);
        // return max;

        // 2 solution
        // int first = nums[0];
        // int middle = nums[nums.length / 2];
        // int last = nums[nums.length - 1];
        // return Math.max(first, Math.max(middle, last));

        // 3 solution
        return Math.max(nums[0], Math.max(nums[nums.length / 2], nums[nums.length - 1]));

    }

}
