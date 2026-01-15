package String1;
public class frontAgain {

    public static void main(String[] args) {
        frontAgain example = new frontAgain();

        // Testing different cases
        System.out.println("Result 1: " + example.frontAgain("edited")); // Expected: true ("ed" == "ed")
        System.out.println("Result 2: " + example.frontAgain("edit"));   // Expected: false ("ed" != "it")
        System.out.println("Result 3: " + example.frontAgain("ed"));     // Expected: true ("ed" == "ed")
        System.out.println("Result 4: " + example.frontAgain("a"));      // Expected: false (length < 2)
        System.out.println("Result 5: " + example.frontAgain(""));       // Expected: false (length < 2)
    }

    public boolean frontAgain(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        String first2 = str.substring(0, 2);
        String last2 = str.substring(str.length() - 2);

        return first2.equals(last2);
    }
}
