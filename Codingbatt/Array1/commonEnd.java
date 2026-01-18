public class commonEnd {
    public static void main(String[] args) {
        commonEnd o = new commonEnd();
        int[] a = { 1, 2, 3 };
        int[] b = { 1 };
        System.out.println(o.commonEnd(a, b));
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);

    }
}
