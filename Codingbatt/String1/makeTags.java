package String1;

public class makeTags {

    public static void main(String[] args) {
        makeTags obj = new makeTags();
        System.out.println(obj.makeTags("i", "Yay"));
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

}
