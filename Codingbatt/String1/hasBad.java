package String1;

public class hasBad {

    public static void main(String[] args) {
        hasBad example = new hasBad();

        // Testing different cases
        System.out.println("Result 1: " + example.hasBad("badxx"));    // Expected: true (index 0)
        System.out.println("Result 2: " + example.hasBad("xbadxx"));   // Expected: true (index 1)
        System.out.println("Result 3: " + example.hasBad("xxbadxx"));  // Expected: false (index 2)
        System.out.println("Result 4: " + example.hasBad("ba"));       // Expected: false (not found)
        System.out.println("Result 5: " + example.hasBad("code"));     // Expected: false (not found)
    }

    public boolean hasBad(String str) {
        int indx = str.indexOf("bad");
        return (indx == 0 || indx == 1);
    }
}
