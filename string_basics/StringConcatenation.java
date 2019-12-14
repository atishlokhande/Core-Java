package string_basics;

public class StringConcatenation {
    public static void  main(String args[]){

        String  s1="wel";
        String s2="come";

        System.out.println(30+70+20+s1+30+20);//120wel3020

        System.out.println(s1+30+20+s2);//wel3020come

        System.out.println(s1+30+20);//wel3020

        System.out.println(30+70+20+s1+s2);//120welcome

        System.out.println(""+30+20);// 3020

        System.out.println(null+"30"+20);//null3020  null is not concates with int so "30" string is used

        //System.out.println(null);

        System.out.println("s1.concat(s2)  ==>"+s1.concat(s2));//welcome
        System.out.println("s1.concat(30)  ==>"+s1.concat("30"));//wel30
    }
}
