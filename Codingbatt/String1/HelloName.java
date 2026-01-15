package String1;

public class HelloName {

    public static void main(String[] args) {
        HelloName obj = new HelloName();
        System.out.println(obj.helloName("Bob"));
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

}
