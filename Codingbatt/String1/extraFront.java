package String1;

public class extraFront {

    public static void main(String[] args) {
        extraFront example = new extraFront();

        // Testing different cases
        System.out.println("Result 1: " + example.extraFront("Hello")); // Expected: "HeHeHe"
        System.out.println("Result 2: " + example.extraFront("ab"));    // Expected: "ababab"
        System.out.println("Result 3: " + example.extraFront("H"));     // Expected: "HHH"
        System.out.println("Result 4: " + example.extraFront(""));      // Expected: ""
    }

    public String extraFront(String str) {
        String res = (str.length() < 2) ? str : str.substring(0, 2);
        return res + res + res;
    }
}
