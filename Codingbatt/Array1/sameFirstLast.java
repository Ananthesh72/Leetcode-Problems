 public class sameFirstLast {
    public static void main(String[] args) {
        sameFirstLast obj = new sameFirstLast();
        int nums[] = { 1, 2, 3 ,1};
        System.out.println(obj.sameFirstLast1(nums));
    }

    public boolean sameFirstLast1(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }
}
