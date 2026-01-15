package String1;

public class deFront {

    public static void main(String[] args) {
        deFront example = new deFront();

        // Testing different cases
        System.out.println("Result 1: " + example.deFront("Hello"));  // Expected: "llo"
        System.out.println("Result 2: " + example.deFront("java"));   // Expected: "va"
        System.out.println("Result 3: " + example.deFront("away"));   // Expected: "aay"
        System.out.println("Result 4: " + example.deFront("ebay"));   // Expected: "bay"
        System.out.println("Result 5: " + example.deFront("abc"));    // Expected: "abc"
        System.out.println("Result 6: " + example.deFront("a"));      // Expected: "a"
        System.out.println("Result 7: " + example.deFront(""));       // Expected: ""
    }

    public String deFront(String str) {
        // 1. Get the part of the string from index 2 onwards
        String result = "";
        if (str.length() > 2) {
            result = str.substring(2);
        }

        // 2. Check the second character (index 1) - must be 'b' to keep
        if (str.length() >= 2 && str.charAt(1) == 'b') {
            result = "b" + result;
        }

        // 3. Check the first character (index 0) - must be 'a' to keep
        if (str.length() >= 1 && str.charAt(0) == 'a') {
            result = "a" + result;
        }

        return result;
    }
}
