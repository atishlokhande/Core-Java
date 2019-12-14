package string_basics;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringClassMethods {
    public static void main(String args[]){

        String s1=new String("atish");
        String s2="Welcome to Java Programming";

        // Make string into the uppercase
        System.out.println("toUpperCase() ==>"+s1.toUpperCase());

        //remove the white spaces
        System.out.println("trim() ==>"+s1.trim());

        //boolean startWith() & endWith()
        System.out.println(s1.startsWith("at"));
        System.out.println(s1.endsWith("h"));

        //search character using the index
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));
        System.out.println(s1.charAt(3));
        System.out.println(s1.charAt(4));

        //replacement of word java by c++
        System.out.println(s2.replace("Java","C++"));

        //substring Methods
        System.out.println(s1.substring(0,3));
        System.out.println(s1.substring(3,5));
        System.out.println(s1.substring(2));

        //use of the StringTokenizer
        StringTokenizer st=new StringTokenizer(s2);
       // StringTokenizer st=new StringTokenizer("Hi welcome to java programming");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // use of the split() method in the String
        //String s3="abdscas";
        System.out.println(Arrays.toString(s2.split("a")));


       // System.out.println(new StringTokenizer(s2).countTokens());

    }
}
