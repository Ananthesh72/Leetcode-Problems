package String1;

public class theEnd {

    // theEnd("Hello", true) → "H"
    // theEnd("Hello", false) → "o"
    // theEnd("oh", true) → "o"
    public static void main(String[] args) {
        theEnd obj = new theEnd();
        System.out.println(obj.theEnd("oh", true));
    }

    public String theEnd(String str, boolean front) {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

}
