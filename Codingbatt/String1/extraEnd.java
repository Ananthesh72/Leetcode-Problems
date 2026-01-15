package String1;

public class extraEnd {

    // extraEnd("Hello") → "lololo"
    // extraEnd("ab") → "ababab"
    // extraEnd("Hi") → "HiHiHi"

    public static void main(String[] args) {
        extraEnd obj = new extraEnd();
        System.out.println(obj.extraEnd("Hello"));
    }

    public String extraEnd(String str) {
        String result = str.substring(str.length() - 2, str.length());
        return result + result + result;
    }

}
