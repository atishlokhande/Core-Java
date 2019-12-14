package default_interface.Static_default;
interface  A{
    static void display(){
        System.out.println("welcome to the interface A");
    }
}
public class StaticDefaultMethod implements A{
    public static void main(String args[]){
        A.display();
        StaticDefaultMethod obj=new StaticDefaultMethod();
        obj.display();
    }

    //static method can not be overrided but overloading is possible..this program run but subclass static method
    // isnot overrided...becouse at compile time method bindig is takes place...
    static void display(){
        System.out.println("welcome to the overrided method.. ");
    }

}
