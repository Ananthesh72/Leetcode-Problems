package String1;

public class endsLy {
    public static void main(String[] args) {
        endsLy obj = new endsLy();
       System.out.println(obj.endsLy1("oddly"));

    }

    private boolean endsLy1(String str){
        return str.length()<=1 ? false : (str.substring(str.length()-3,str.length()) =="ly" ? true : false);
    }
}
