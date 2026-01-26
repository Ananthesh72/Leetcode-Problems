public class firstLast6 {
    public static void main(String[] args) {

        firstLast6 obj = new firstLast6();
        int nums[] = { 13, 6, 1, 2, 6 };
        System.out.println(obj.firstLast6(nums));
    }

    public boolean firstLast6(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

}