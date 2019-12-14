package abstract_class_interface_demo;

public class TestMultInheritance extends First implements I1{

    public static  void main(String[] args){
        TestMultInheritance test=new TestMultInheritance();
        test.display();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Welcome to Main...!!!!!");
    }
}
