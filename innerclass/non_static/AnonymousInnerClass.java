package innerclass.non_static;

public class AnonymousInnerClass
{
    public static void main(String args[]){
        Person newPerson=new Person(){
            public  void eat(){
                System.out.println("this is the anonymous inner class method..");
            }
        };
        newPerson.eat();
    }
}
abstract  class Person{
    public abstract void eat();
}