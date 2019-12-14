package innerclass.non_static;
//created within the class and outside the method
public class MemberInnerClass
{
    static int num1=10;
    final int num2=20;
    private int num3=30;
    int num4=5;

    class Inner
    {
        public void showNumbers()
        {
            System.out.println("Static member of the outer class:"+num1);
            System.out.println("final member of the outer class:"+num2);
            System.out.println("private member of the outer class:"+num3);
            System.out.println("default member of the outer class:"+num4);

        }
    }
    public static  void main(String []args){
        MemberInnerClass mic=new MemberInnerClass();
        MemberInnerClass.Inner objInner=mic.new Inner();
        objInner.showNumbers();

    }

}
