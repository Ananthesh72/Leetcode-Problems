package String1;

public class withoutX2 {

    public static void main(String[] args) {
        withoutX2 obj = new withoutX2();
        System.out.println(obj.withoutX("Hxi")); // Hxi
    }

    public String withoutX(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == 'x') {
                continue;
            }
            if (i == 1 && str.charAt(i) == 'x') {
                continue;
            }
            res += str.charAt(i);
        }

        return res;
    }
}
