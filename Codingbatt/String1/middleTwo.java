package String1;

public class middleTwo {

    public static void main(String[] args) {
        middleTwo example = new middleTwo();

        // Testing different cases (strings will always be even length of at least 2)
        System.out.println("Result 1: " + example.middleTwo("string")); // Expected: "ri"
        System.out.println("Result 2: " + example.middleTwo("code"));   // Expected: "od"
        System.out.println("Result 3: " + example.middleTwo("Practice")); // Expected: "ct"
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
