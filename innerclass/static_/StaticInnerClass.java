package innerclass.static_;

public class StaticInnerClass {
    static int num1=10;
    int num2=20;
    private int num3=30;

   static class Inner{
       public  void display()
       {

           // Only static members of the outer class are allowed in the static context
               System.out.println("Static member of the outer class:"+num1);

           /*- default and the private members are not allowed in static inner context-*/

           //System.out.println("Default member of the outer class:"+num2);
           //System.out.println("Private member of the outer class"+num3);
       }

    }
    public static void main(String args[]){
       StaticInnerClass.Inner obj=new StaticInnerClass.Inner();
       //StaticInnerClass.inner innerClass=outerClass.new inner();
       obj.display();
    }

}
