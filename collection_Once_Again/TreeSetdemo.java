package collection_Once_Again;

import java.util.TreeSet;
public class TreeSetdemo {
    public static  void main(String args[])
    {
       Object o1=new A();
       Object o2= o1;

       TreeSet tm=new TreeSet();
       tm.add(o1);
       tm.add(o2);

       System.out.println(tm);
    }
}
class A implements Comparable{

    A(){
       System.out.println("welcome to java");
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}