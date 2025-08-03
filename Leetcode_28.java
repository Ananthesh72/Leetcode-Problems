import java.util.*;

public class Leetcode_28 {
    public static int strStr(String haystack, String needle) {
     int H_length = haystack.length();
     int n_length = needle.length();

     if(n_length == 0) return 0;
     if(n_length > H_length) return -1;

    for (int i=0;i<= H_length - n_length;i++ )
    {
        if(haystack.substring(i,i+n_length).equals(needle)){
            return i;
        }
    }
    return -1;
    }

    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle = "sad";
        int result = strStr(haystack,needle);
        System.out.println(result);
    }
}