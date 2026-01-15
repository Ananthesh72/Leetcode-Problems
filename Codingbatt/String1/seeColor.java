package String1;

public class seeColor {

    public static void main(String[] args) {
        seeColor example = new seeColor();

        // Testing different cases
        System.out.println("Result 1: " + example.seeColor("redxx"));    // Expected: "red"
        System.out.println("Result 2: " + example.seeColor("xxred"));    // Expected: ""
        System.out.println("Result 3: " + example.seeColor("blueTimes")); // Expected: "blue"
        System.out.println("Result 4: " + example.seeColor("noColor"));   // Expected: ""
        System.out.println("Result 5: " + example.seeColor("re"));        // Expected: ""
    }

    public String seeColor(String str) {
        if (str == null) return "";

        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        }

        return "";
    }
}
