package String1;

public class comboString {
    public static void main(String[] args) {
        comboString o = new comboString();
        System.out.println(o.comboString1("Hello", "hi"));
    }

    private String comboString1(String a, String b) {
        /*int shortlen = Math.min(a.length(), b.length());
        int longlen = Math.max(a.length(), b.length());
        String resultstr = "";
        int length = resultstr.length();
        while (shortlen + longlen + shortlen > resultstr.length()) {
            if (shortlen == a.length()) {
                resultstr = a + b + a;
            } else {
                resultstr = b + a + b;
            }
        }
        return resultstr;*/
            return (a.length() < b.length()) ? a+b+a : b+a+b;

    }
}
