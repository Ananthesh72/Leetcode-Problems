package String1;

public class withoutX {

    public static void main(String[] args) {
        withoutX obj = new withoutX();
        // System.out.println(obj.withoutX1("xaxbx"));  //axb
        System.out.println(obj.withoutX1("Hxix"));  //axb
    }
    public String withoutX1(String str) {
        if (str.length() <= 1) {
            return "";
        }
        String res ="";
        if (str.startsWith("x")) {
            res = str.substring(1, str.length());
        } else {
            res = str.substring(0, str.length());
        }
        if (res.endsWith("x")) {
            res = res.substring(0, res.length() - 1);
        } else {
            res = res.substring(0, res.length());
        }
        return res;
    }
}
