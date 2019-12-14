package default_interface.Interface_extension;

public interface InterfaceB extends  InterfaceA{

    default void display(){
        System.out.println("In interface B");
    }
}
