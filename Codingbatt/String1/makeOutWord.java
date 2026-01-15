package String1;

public class makeOutWord {

    // makeOutWord("<<>>", "Yay") → "<<Yay>>"
    // makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    // makeOutWord("[[]]", "word") → "[[word]]"

    public static void main(String[] args) {
        makeOutWord obj = new makeOutWord();
        System.out.println(obj.makeOutWord("<<>>", "Yay"));
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

}
