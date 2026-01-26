public class has23 {
    public static void main(String[] args) {
        has23 obj = new has23();
        System.out.print(obj.has23_(new int[] { 2, 5 }));
    }

    public boolean has23_(int[] nums) {
        for (int i : nums) {
            if (i == 2 || i == 3) {
                return true;
            }
        }
        return false;
    }

}
