package String1;

public class firstTwo{
    public static void main(String[] args) {
        firstTwo obj = new firstTwo();
        
        System.out.println(obj.firstTwo1("a"));

    }
    private String firstTwo1(String str){
        return (str.length()<=1) ?  str: str.substring(0,2);
    }
}
