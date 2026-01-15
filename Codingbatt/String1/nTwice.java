package String1;
public class nTwice {
    public static void main(String[] args) {
        /* 
        nTwice("Hello", 2) → "Helo"
        nTwice("Chocolate", 3) → "Choate"
        nTwice("Chocolate", 1) → "Ce"*/
        nTwice obj = new nTwice();
        System.out.println(obj.nTwice1("Chocolate",2));
    }

    public  String nTwice1(String str, int n) {
    return str.substring(0,n)+ str.substring(str.length()-n,str.length());
    }

}
