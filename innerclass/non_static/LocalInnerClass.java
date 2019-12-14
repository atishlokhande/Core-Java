package innerclass.non_static;

public class LocalInnerClass
{
    final int x=30;
    private int y=20;
    static int z=2;

    public void innerClassMethod()
    {
        class Inner
        {
           public void display(){
               System.out.println("Values of final x="+x);
               System.out.println("Value of private y="+y);
               System.out.println("Value of private z="+z);
           }
        }
        Inner inner=new Inner();
        inner.display();
    }

    public static void main(String args[]){
        LocalInnerClass outer=new LocalInnerClass();
        outer.innerClassMethod();
    }
}
