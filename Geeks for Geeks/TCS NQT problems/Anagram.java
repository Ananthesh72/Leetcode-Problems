

public class Anagram {
    public static void main(String[] args) {


        String str1="silent";
        String str2="listen";

        boolean res = Anagram_str(str1,str2);
        System.out.println(res);
    }

    static boolean Anagram_str(String str1,String str2){

        if(str1.length() == str2.length())
            return false;

        int [] count = new int[26];

        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c!=0) return false;
        }
        return true;
    }
}