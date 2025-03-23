public class Two_sum {
    public static void main(String[] args) {
      int[] nums = { 2, 7, 11, 15 };
      int target = 9;
      twosum(nums, target);
    }
  
    public static int[] twosum(int[] num, int target) {
      for (int i = 0; i < num.length; i++) {
        for (int j = i + 1; j < num.length; j++) {
          if (target == num[i] + num[j]) {
            return new int[] { i, j };
          }
        }
      }
      return null;
    }
  }