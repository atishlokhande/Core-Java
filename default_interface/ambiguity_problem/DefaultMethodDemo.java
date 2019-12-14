package default_interface.ambiguity_problem;

public class DefaultMethodDemo implements InterfaceB, InterfacA {

    public static void main(String args[]) {
        DefaultMethodDemo dm=new DefaultMethodDemo();
        dm.display();
    }
    // To solve the ambiguity problem of default method we have to override the the methods of interface
    // and follows the syntax..as shown in following method..

   @Override
    public void display() {
            InterfacA.super.display();
            InterfaceB.super.display();
            System.out.println("Hi....I am in DefaultMethodClass..!!!!!!");
    }
}
