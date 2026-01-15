public class makeAbba {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2= "Bye";
        String resut = makeAbba1(str1,str2);
        System.out.println(resut);
    }

    private static String makeAbba1(String a, String b){
        return  a+b+b+a;    
    }
}
