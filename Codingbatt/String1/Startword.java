package String1;

public class Startword {

  public static String startWord1(String str, String word) {

    if(str.length() < word.length()){
      return "";
    }
    if (str.length() == 0 || str.length() <= 1) {
      return str;
    } else {
      if (str.substring(1, word.length()).equals(word.substring(1, word.length()))) {
          return str.charAt(0)+ word.substring(1, word.length());
      }else{
        return "";
      }
    }
  }
  public static void main(String[] args) {
    System.out.println(startWord1("h", "ix"));
  }
}



// startWord("hippo", "hi") → "hi"	""	X	
// startWord("hippo", "xip") → "hip"	""	X	
// startWord("hippo", "i") → "h"	""	X	
// startWord("hippo", "ix") → ""	""	OK	
// startWord("h", "ix") → ""	""	OK	
// startWord("", "i") → ""	""	OK	
// startWord("hip", "zi") → "hi"	""	X	
// startWord("hip", "zip") → "hip"	""	X	
// startWord("hip", "zig") → ""	""	OK	
// startWord("h", "z") → "h"	""	X	
// startWord("hippo", "xippo") → "hippo"	""	X	
// startWord("hippo", "xyz") → ""	""	OK	
// startWord("hippo", "hip") → "hip"	""	X	
// startWord("kitten", "cit") → "kit"	""	X	
// startWord("kit", "cit") → "kit"