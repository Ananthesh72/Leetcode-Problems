package String1;

public class twoChar {

    public static void main(String[] args) {
        twoChar example = new twoChar();

        // Testing different cases
        System.out.println("Result 1: " + example.twoChar("java", 0));    // Expected: "ja"
        System.out.println("Result 2: " + example.twoChar("java", 2));    // Expected: "va"
        System.out.println("Result 3: " + example.twoChar("java", 3));    // Expected: "ja" (index too far)
        System.out.println("Result 4: " + example.twoChar("Hello", 2));   // Expected: "ll"
        System.out.println("Result 5: " + example.twoChar("Hello", -1));  // Expected: "He" (index negative)
    }

    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
}
