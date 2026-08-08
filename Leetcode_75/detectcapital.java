public class detectcapital {
    public static void main(String[] args) {
        
        System.out.println(detectCapitalUse("aFdasdas"));
        
    }

    static boolean detectCapitalUse(String str){

        if(str.length() == 0)
            return false;

        int uppercase=0;

        for(int i=0;i< str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                uppercase++;
            }
        }
        if(uppercase == str.length() || uppercase == 0 || (uppercase ==1 && Character.isUpperCase(str.charAt(0)))){
            return true;
        }
        return false;
    }
}
