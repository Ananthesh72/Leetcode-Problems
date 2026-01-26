import java.util.Arrays;

public class biggerTwo {
    public static void main(String[] args) {
        biggerTwo obj = new biggerTwo();
        System.out.println(Arrays.toString(obj.biggerTwo_(new int[] { 1, 2 }, new int[] { 3, 4 })));
    }

    public int[] biggerTwo_(int[] a, int[] b) {
        int sum_a = 0;
        int sum_b = 0;
        for (int i : a) {
            sum_a += i;
        }

        for (int j : b) {
            sum_b += j;
        }
        if (sum_a >= sum_b) {
            return a;
        } else {
            return b;
        }

    }

}
