package String1;

public class right2 {

    // right2("Hello") → "loHel"
    // right2("java") → "vaja"
    // right2("Hi") → "Hi"
    public static void main(String[] args) {
        right2 obj = new right2();
        System.out.println(obj.right2("java"));
    }

    public String right2(String str) {
        return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
    }

}
