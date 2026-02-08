import java.lang.reflect.Array;
import java.util.Arrays;

public class make2 {
    public static void main(String[] args) {
        make2 obj = new make2();

        // make2([4, 5], [1, 2, 3]) → [4, 5]
        // make2([4], [1, 2, 3]) → [4, 1]
        // make2([], [1, 2]) → [1, 2]
        int[] A = { 4, 5 };
        int[] B = { 1, 2, 3 };

        System.out.println(Arrays.toString(obj.make2_1(A, B)));
    }

    public int[] make2_1(int[] a, int[] b) {

        if (a.length == 0)
            return new int[] { b[0], b[1] };
        else if (a.length == 1)
            return new int[] { a[0], b[0] };
        else if (a.length >= 2)
            return new int[] { a[0], a[1] };
        else
            return new int[] { b[0], b[1] };
    }
}
