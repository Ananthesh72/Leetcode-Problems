public class sum3 {
    public static void main(String[] args) {
        sum3 obj = new sum3();
        int[] nums = { 1, 2, 3 };// ([1, 2, 3]) → 6
        System.out.println(obj.Sum3_(nums));

    }

    public int Sum3_(int[] nums) {
        int sum = 0;
        for (int i : nums) {
             sum += i;
        }
        return sum;
    }

}
