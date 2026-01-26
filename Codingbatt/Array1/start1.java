public class start1 {
    // start1([1, 2, 3], [1, 3]) → 2
    public static void main(String[] args) {
        start1 obj = new start1();

        System.out.println(obj.start1_(new int[] { 1, 2, 3 }, new int[] { 1, 3 }));
    }

    public int start1_(int[] a, int[] b) {
        int count = 0;
        if (a.length == 0 && b.length == 0) {
            return count;
        }
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

}
