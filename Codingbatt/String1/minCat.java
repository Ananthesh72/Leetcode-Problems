package String1;

public class minCat {

    public static void main(String[] args) {
        minCat example = new minCat();

        // Testing different cases
        System.out.println("Result 1: " + example.minCat("Hello", "Hi"));    // Expected: "loHi"
        System.out.println("Result 2: " + example.minCat("Hello", "java"));  // Expected: "ellojava"
        System.out.println("Result 3: " + example.minCat("java", "Hello"));  // Expected: "javaello"
        System.out.println("Result 4: " + example.minCat("abc", "xyz"));     // Expected: "abcxyz"
        System.out.println("Result 5: " + example.minCat("x", "abc"));       // Expected: "xc"
    }

    public String minCat(String a, String b) {
        int sl1 = a.length();
        int sl2 = b.length();

        if (sl1 == sl2) {
            return a + b;
        }

        if (sl1 > sl2) {
            return a.substring(sl1 - sl2) + b;
        } else {
            return a + b.substring(sl2 - sl1);
        }
    }
}

