package string_basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringCampar1
{
    public static void main(String  arg[]){

        String  s1="java";
        String s2= "java";
        char s[]={'j','a','v','a'};
        String s3=new String(s);
        String s4="jvm";
        String s5="Progm";

       // System.out.println(s1.hashCode());
        //System.out.println(s2.hashCode());
        System.out.println("String comparing with the help of the following methods:");
        System.out.println();

        System.out.println("s1.equals(s2)="+s1.equals(s2));//true
        System.out.println("s1.equals(s3)="+s1.equals(s3));//true

        System.out.println("s1==s2 ?=>"+(s1==s2));//true
        System.out.println("s1==s3 ?=>"+(s1==s3));//false

        System.out.println("s1.compareTo(s2)="+s1.compareTo(s2));//0
        System.out.println("s1.compareTo(s3)="+s1.compareTo(s3));//0
        System.out.println("s1.compareTo(s4)="+s4.compareTo(s1));//+1
        System.out.println("s1.compareTo(s5)="+s5.compareTo(s1));//-7

    }
}
