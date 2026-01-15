package String1;

public class nonStart {

    // nonStart("Hello", "There") → "ellohere"
    // nonStart("java", "code") → "avaode"
    // nonStart("shotl", "java") → "hotlava"
    public static void main(String[] args) {
        nonStart obj = new nonStart();
        System.out.println(obj.nonStart("shotl", "java"));
    }

    public String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

}
