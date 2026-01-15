package String1;

public class atFirst {

    public static void main(String[] args) {
        atFirst example = new atFirst();

        // Testing different cases
        System.out.println("Result 1: " + example.atFirst("hello")); // Expected: "he"
        System.out.println("Result 2: " + example.atFirst("hi"));    // Expected: "hi"
        System.out.println("Result 3: " + example.atFirst("h"));     // Expected: "h@"
        System.out.println("Result 4: " + example.atFirst(""));      // Expected: "@@"
    }

    public String atFirst(String str) {
        return (str.length() < 2) ? 
               ((str.length() == 1) ? str + "@" : "@@") : 
               str.substring(0, 2);
    }
}
