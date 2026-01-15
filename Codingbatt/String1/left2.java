package String1;

public class left2 {

    // left2("Hello") → "lloHe"
    // left2("java") → "vaja"
    // left2("Hi") → "Hi"
    public static void main(String[] args) {
        left2 obj = new left2();
        System.out.println(obj.left2("Hello"));
    }

    public String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }
}
