package String1;

public class withoutEnd {
    public static void main(String[] args) {
        
        withoutEnd obj = new  withoutEnd();
         System.out.println(obj.withoutEnd1("Hello"));
    }
    private String withoutEnd1(String str){
        return str.substring(1,str.length()-1);
    }
}
