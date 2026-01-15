package String1;


public class conCat {

    public static void main(String[] args) {
        conCat example = new conCat();

        // Testing different cases
        System.out.println("Result 1: " + example.conCat("abc", "cat")); // Expected: "abcat"
        System.out.println("Result 2: " + example.conCat("dog", "cat")); // Expected: "dogcat"
        System.out.println("Result 3: " + example.conCat("abc", ""));    // Expected: "abc"
        System.out.println("Result 4: " + example.conCat("", "cat"));    // Expected: "cat"
        System.out.println("Result 5: " + example.conCat("pig", "g"));   // Expected: "pig"
    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        }
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }

        return a + b;
    }
}
