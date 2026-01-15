package String1;
public class middleThree {

    public static void main(String[] args) {
        middleThree obj = new middleThree();
        System.out.println(obj.middleThree1("solving"));
    }
    private String middleThree1(String str){
        int mid = str.length()/2;
        return (str.length() ==3)? str:str.substring(mid-1,mid+2);
    }

}