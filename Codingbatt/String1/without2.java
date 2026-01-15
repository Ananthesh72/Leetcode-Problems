package String1;

public class without2 {

    public static void main(String[] args) {
        without2 example = new without2();

        // Testing different cases
        System.out.println("Result 1: " + example.without2("HelloHe")); // Expected: "lloHe"
        System.out.println("Result 2: " + example.without2("HelloHi")); // Expected: "HelloHi"
        System.out.println("Result 3: " + example.without2("Hi"));      // Expected: ""
        System.out.println("Result 4: " + example.without2("H"));       // Expected: "H"
        System.out.println("Result 5: " + example.without2(""));        // Expected: ""
    }

    public String without2(String str) {
        int len = str.length();
        if (len < 2) {
            return str;
        }

        // Compare the first 2 chars with the last 2 chars
        if (str.substring(0, 2).equals(str.substring(len - 2))) {
            return str.substring(2);
        } else {
            return str;
        }
    }
}
