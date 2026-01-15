package String1;

public class withouEnd2 {

    public static void main(String[] args) {
        withouEnd2 example = new withouEnd2();

        // Testing different cases
        System.out.println("Result 1: " + example.withouEnd2("Hello")); // Expected: "ell"
        System.out.println("Result 2: " + example.withouEnd2("abc"));   // Expected: "b"
        System.out.println("Result 3: " + example.withouEnd2("ab"));    // Expected: ""
        System.out.println("Result 4: " + example.withouEnd2("a"));     // Expected: ""
    }

    public String withouEnd2(String str) {
        return str.length() <= 1 ? "" : str.substring(1, str.length() - 1);
    }
}
