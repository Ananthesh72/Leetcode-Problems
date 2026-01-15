package String1;

public class firsthalf{
    public static void main(String[] args) {
        firsthalf obj = new firsthalf();
        
        System.out.println(obj.firsthalf1("0123456789"));

    }
    private String firsthalf1(String str){
        int half = Math.round(Math.min(str.length()/2,str.length()));
        return (str.length()<=1) ?  str: str.substring(0,half);
    }
}
