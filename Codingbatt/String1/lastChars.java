package String1;
public class lastChars {

    public static void main(String[] args) {
        lastChars example = new lastChars();

        // Testing different cases
        System.out.println("Result 1: " + example.lastChars("last", "chars")); // Expected: "ls"
        System.out.println("Result 2: " + example.lastChars("yo", "java"));    // Expected: "ya"
        System.out.println("Result 3: " + example.lastChars("hi", ""));        // Expected: "h@"
        System.out.println("Result 4: " + example.lastChars("", "res"));       // Expected: "@s"
        System.out.println("Result 5: " + example.lastChars("", ""));          // Expected: "@@"
    }

    public String lastChars(String a, String b) {
        String aa = (a.length() > 0) ? a.substring(0, 1) : "@";
        String bb = (b.length() > 0) ? b.substring(b.length() - 1) : "@";

        return aa + bb;
    }
}
