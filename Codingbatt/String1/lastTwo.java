package String1;

public class lastTwo {

    public static void main(String[] args) {
        lastTwo example = new lastTwo();

        // Testing different cases
        System.out.println("Result 1: " + example.lastTwo("coding")); // Expected: "codign"
        System.out.println("Result 2: " + example.lastTwo("cat"));    // Expected: "cta"
        System.out.println("Result 3: " + example.lastTwo("ab"));     // Expected: "ba"
        System.out.println("Result 4: " + example.lastTwo("a"));      // Expected: "a"
        System.out.println("Result 5: " + example.lastTwo(""));       // Expected: ""
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        }
    }
}
